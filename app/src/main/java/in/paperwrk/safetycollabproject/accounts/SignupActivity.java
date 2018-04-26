package in.paperwrk.safetycollabproject.accounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import in.paperwrk.safetycollabproject.R;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        if(getSupportActionBar() != null)
            getSupportActionBar().hide();
    }

    public void openSigninActivity(View view) {
        finish();
    }
}