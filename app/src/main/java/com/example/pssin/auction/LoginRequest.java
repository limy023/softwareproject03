package com.example.pssin.auction;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    final static private String URL = "http://pssin1.cafe24.com/accountLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String accountID, String accountPassword, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("accountID", accountID);
        parameters.put("accountPassword", accountPassword);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }

}
