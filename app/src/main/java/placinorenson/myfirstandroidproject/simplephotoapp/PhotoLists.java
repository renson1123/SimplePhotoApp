package placinorenson.myfirstandroidproject.simplephotoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.myfirstandroidproject.simplephotoapp.R;

import java.util.List;

public class PhotoLists extends ListActivity {

    List<Uri> uriList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_lists);

        uriList =  ( (MyApplication)this.getApplication() ).getUriList();

        ArrayAdapter adapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1 , uriList);

        setListAdapter(adapter);
    }

}