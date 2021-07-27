package com.mystery.cenarius.service;

import com.mystery.cenarius.domain.MemberDetails;
import com.mystery.cenarius.mapper.UmsMemberMapper;
import com.mystery.cenarius.model.UmsMember;
import com.mystery.cenarius.model.UmsMemberExample;
import io.micrometer.core.instrument.util.StringUtils;
import org.mybatis.generator.codegen.mybatis3.model.ExampleGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mystery
 */
@Service
public class CenariusUserDetailServiceImpl implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(CenariusUserDetailServiceImpl.class);

    @Resource
    private UmsMemberMapper umsmembermapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if (StringUtils.isBlank(userName)) {
            log.warn("登录用户名为空");
            throw new UsernameNotFoundException("登录用户名为空");
        }
        UmsMember loginUser = getUserByName(userName);
        if (loginUser == null) {
            throw new UsernameNotFoundException("用户未找到");
        }
        return new MemberDetails(loginUser);
    }

    private UmsMember getUserByName(String userName) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(userName);
        List<UmsMember> umsMembers = umsmembermapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            return umsMembers.get(0);
        }
        return null;
    }
}
