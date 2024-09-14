package ee.forgr.capacitor.social.login;

import org.json.JSONObject;

import java.util.Map;

public interface SocialProvider {
    FunctionResult<Void, String> login(PluginHelpers helpers, JSONObject config);
    FunctionResult<Void, String> logout();
    FunctionResult<String, String> getAuthorizationCode();
    FunctionResult<Map<String, Object>, String> getCurrentUser();
    FunctionResult<Void, String> refresh();
}
