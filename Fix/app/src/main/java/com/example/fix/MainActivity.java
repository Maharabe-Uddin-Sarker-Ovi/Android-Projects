package com.example.fix;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.niterclubs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] maintitle = new String[]{"NITER Games and Sports Club", "NITER Cultural Club", "NITER Computer Club", "NITER Career Club", "NITER Science Socity"};
    Integer[] imgid = new Integer[]{2131230860, 2131230860, 2131230860, 2131230860, 2131230860};

    public MainActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131558428);
        ListAdapter adapter = new ListAdapter(this, this.maintitle, this.imgid);
        this.list = (ListView)this.findViewById(2131362029);
        this.list.setAdapter(adapter);
        this.list.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String)MainActivity.this.list.getItemAtPosition(position);
                int result = true;
                byte var10 = -1;
                switch(value.hashCode()) {
                    case 1019719642:
                        if (value.equals("NITER Cultural Club")) {
                            var10 = 1;
                        }
                        break;
                    case 1517123637:
                        if (value.equals("NITER Games and Sports Club")) {
                            var10 = 0;
                        }
                }

                switch(var10) {
                    case 0:
                        Intent southparkScreen = new Intent(MainActivity.this, NGSC.class);
                        MainActivity.this.startActivity(southparkScreen);
                        break;
                    case 1:
                        Intent southparkScreen1 = new Intent(MainActivity.this, NCuC.class);
                        MainActivity.this.startActivity(southparkScreen1);
                }

            }
        });
    }
}
