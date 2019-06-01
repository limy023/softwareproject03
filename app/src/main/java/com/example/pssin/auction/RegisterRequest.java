package com.example.pssin.auction;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://pssin1.cafe24.com/accountRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String accountID, String accountPassword, String accountName, String accountPhoneNumber, Response .Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("accountID", accountID);
        parameters.put("accountPassword", accountPassword);
        parameters.put("accountName", accountName);
        parameters.put("accountPhoneNumber", accountPhoneNumber);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
