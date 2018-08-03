package com.example.dingran.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dingran.databindingtest.databinding.ActivityMainBinding;
// 此处容易犯错啊，多了个databinding包名，多了一层，run之后，Alt+Enter自动引入就行了，不用自己写import
//import com.example.dingran.databindingtest.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewModel model = new ViewModel(getResources().getString(R.string.prompt));
        binding.setModel(model);

        ActionHandler handler = new ActionHandler();
        binding.setHandler(handler);
    }
}
