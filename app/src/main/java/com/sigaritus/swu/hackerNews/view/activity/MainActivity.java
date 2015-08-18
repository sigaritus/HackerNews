package com.sigaritus.swu.hackerNews.view.activity;


import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoryRESTAdapter;
import com.sigaritus.swu.hackerNews.R;
import com.sigaritus.swu.hackerNews.view.adapter.NewAndTopFragmentAdapter;
import com.sigaritus.swu.hackerNews.view.fragment.NewStoryFragment;
import com.sigaritus.swu.hackerNews.view.fragment.TopStoryFragment;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    String[] tab_names ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();



    }

    private void initViews(){

        pager = (ViewPager)findViewById(R.id.pager);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        tab_names = getResources().getStringArray(R.array.tab_name);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = this.getSupportActionBar();

        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.open, R.string.close);

        mActionBarDrawerToggle.syncState();

        drawerLayout.setDrawerListener(mActionBarDrawerToggle);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        if (pager != null) {
            setupViewPager(pager);
        }

        tabLayout.setupWithViewPager(pager);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        switch (menuItem.getItemId()){
                            case R.id.nav_home:
                                break;
                            case R.id.nav_ask:
                                Toast.makeText(MainActivity.this,"ask",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.nav_show:

                                break;
                            case R.id.nav_job:

                                break;

                        }
                        drawerLayout.closeDrawers();
                        return true;
                    }
                });
    }

    private void setupViewPager(ViewPager pager) {
        NewAndTopFragmentAdapter adapter = new NewAndTopFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new TopStoryFragment(),tab_names[0] );
        adapter.addFragment(new NewStoryFragment(), tab_names[1]);
        pager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
