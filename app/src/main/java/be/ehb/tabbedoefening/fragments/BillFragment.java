package be.ehb.tabbedoefening.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import be.ehb.tabbedoefening.R;



public class BillFragment extends Fragment {

    private EditText etTotal;
    private EditText etAmount;
    private EditText etSize;
    private Button btnMoney;

    private View.OnClickListener onBillClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(etTotal.getText());
            stringBuilder.append(etAmount.getText());
            stringBuilder.append(etSize.getText());

        }
    };


    public static BillFragment newInstance() {
        BillFragment fragment = new BillFragment();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bill, container, false);


        return v;
    }


}
