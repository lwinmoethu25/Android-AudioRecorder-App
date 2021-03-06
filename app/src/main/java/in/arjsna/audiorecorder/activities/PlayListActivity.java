package in.arjsna.audiorecorder.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import in.arjsna.audiorecorder.R;
import in.arjsna.audiorecorder.playlist.PlayListFragment;
import in.arjsna.audiorecorder.mvpbase.BaseActivity;

public class PlayListActivity extends BaseActivity {

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_record_list);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.setTitle(R.string.tab_title_saved_recordings);
      actionBar.setDisplayHomeAsUpEnabled(true);
      actionBar.setDisplayShowHomeEnabled(true);
    }
    setNavBarColor();

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(R.id.record_list_container, PlayListFragment.newInstance())
          .commit();
    }
  }
}
