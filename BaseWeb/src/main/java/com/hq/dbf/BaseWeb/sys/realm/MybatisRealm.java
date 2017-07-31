package com.hq.dbf.BaseWeb.sys.realm;

import com.hq.dbf.BaseDomain.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by Administrator on 2017/3/9.
 */
@Slf4j
public class MybatisRealm extends AuthorizingRealm {

    /*@Autowired
    @Lazy
    private IUserService userService;*/

    /*@Autowired
    @Lazy
    private IPermissionService permissionService;*/

    /**
     * 授权操作，决定那些角色可以使用那些资源
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //null usernames are invalid
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        String username = (String) getAvailablePrincipal(principals);

        try {
            return getAuthorizationInfo(username);
        } catch (ServiceException e) {
            throw new AuthorizationException(e);
        }
    }

    private SimpleAuthorizationInfo getAuthorizationInfo(String username) throws ServiceException {
        /*SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(userService.getRoleStringsByUserName(username));
        info.setStringPermissions(permissionService.getPermissionStringsByLoginName(username));

        return info;*/
        return null;
    }

    /**
     * 认证操作，判断一个请求是否被允许进入系统
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        /*UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        User user;
        // Null username is invalid
        if (username == null) {
            throw new AccountException("Null usernames are not allowed by this realm.");
        }
        try {
            user = userService.findByLoginName(username);
        } catch (Exception e) {
            final String message = "There was a SQL error while authenticating user [" + username + "]";

            if (log.isErrorEnabled()) {
                log.error(message, e);
            }

            // Rethrow any SQL errors as an authentication exception
            throw new AuthenticationException(message, e);
        }

        if (null == user) {
            throw new UnknownAccountException("No account found for user [" + username + "]");
        }
        return new SimpleAuthenticationInfo(username, user.getPassword(), getName());*/

        return null;
    }
}
