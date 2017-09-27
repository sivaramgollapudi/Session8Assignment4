package com.sivaram.session8assignment4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import junit.runner.Version;

import java.util.List;

/**
 * Created by User on 27/09/2017.
 */

public class CustomImageTextAdapter extends BaseAdapter  {

    // Private Variables for Application Context And List of Versions Object.
    private Context context;
    private List<Versions> androidVersionsList;

    // Custom Image And Text Adapter Constructor
    public CustomImageTextAdapter(Context context, List<Versions> androidVersionsList) {
        this.context = context;
        this.androidVersionsList = androidVersionsList;
    }

    // Override Methods for Base Adapter
    @Override
    public int getCount() {
        return androidVersionsList.size();
    }

    @Override
    public Object getItem(int position) {
        return androidVersionsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        // Construct Veiw By Inflating the Activity. This will allow the class to access
        // Views which are created in the Activity.
        View customView = view.inflate(context, R.layout.image_text_view,null);

        // Type Cast Image And Text View To Assign Android Version and Android Version Name
        ImageView imgAndroidVersion = (ImageView) customView.findViewById(R.id.imgAndroidVersion);
        TextView txtAndroidVersion = (TextView) customView.findViewById(R.id.txtAndroidVersion);

        // Set Android Version And Version Name Based on the Current Position of the View
        // And the Data Available in List Object.
        // Access Data using Get Methods of respective Variables
        txtAndroidVersion.setText(androidVersionsList.get(position).getVersionName());
        imgAndroidVersion.setImageResource(androidVersionsList.get(position).getVersionImage());

        // Finally Reutn the View... This will go on for each row.
        return customView;
    }
}
