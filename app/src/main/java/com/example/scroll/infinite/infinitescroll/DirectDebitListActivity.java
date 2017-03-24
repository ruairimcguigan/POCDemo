package com.example.scroll.infinite.infinitescroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.scroll.infinite.infinitescroll.directdebit.DirectDebitAdapter;
import com.example.scroll.infinite.infinitescroll.directdebit.DirectDebitView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DirectDebitListActivity extends AppCompatActivity implements DirectDebitView{

    @BindView(R.id.direct_debit_list)
    RecyclerView directDebitList;

    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    DirectDebitAdapter directDebitAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setUpDirectDebitList();

        getInjector();


    }

    private void getInjector() {
        ((PracticeApplication)getApplication()).getApplicationComponent().inject(this);
        ((PracticeApplication)getApplication()).getApplicationComponent().injectDirectDebitAdpter(directDebitAdapter);


    }

    private void setUpDirectDebitList() {
        directDebitAdapter = new DirectDebitAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        directDebitList.setLayoutManager(linearLayoutManager);
        directDebitList.setHasFixedSize(true);
        directDebitList.setAdapter(directDebitAdapter);


    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

//    private void setupDirectDebitAdapter() {
//        debitAdapter = new DirectDebitAdapter(this);
//        debitAdapter.setOnItemClickedListener(new BaseAdapter.Listener<DirectDebit>() {
//            @Override
//            public void onItemClicked(DirectDebit item) {
//                presenter.viewDirectDebit(item);
//            }
//        });
//
//        getInjector().inject(debitAdapter);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(debitAdapter);
//    }

}
