package nl.saxion.tk.twitterapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import nl.saxion.tk.twitterapp.R;
import nl.saxion.tk.twitterapp.models.User;

public class UserActivity extends AppCompatActivity {

    private User user;
    private TextView textViewName, textViewScreenName, textViewDescription,textViewLocation,textViewFriendsCount,textViewFollowersCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(nl.saxion.tk.twitterapp.R.layout.activity_user);

        textViewName = findViewById(R.id.textViewName);
        textViewScreenName = findViewById(R.id.textViewScreenName);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewLocation = findViewById(R.id.textViewLocation);
        textViewFriendsCount = findViewById(R.id.textViewFriendsCount);
        textViewFollowersCount = findViewById(R.id.textViewFollowersCount);


        //TODO dit vervangen door dynamische user info
        this.user = new User("Hightech Twente","twente","Enschede","Twente Branding houdt zich bezig met de nationale en internationale positionering van Twente als innovatieve hightech kennisregio.");

        loadUser();
    }

    private void loadUser(){

        textViewName.setText(user.getName());
        textViewScreenName.setText(user.getScreen_name());
        textViewDescription.setText(user.getDescription());
        textViewLocation.setText(user.getLocation());
    }
}
