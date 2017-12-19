package com.example.fajar.remedies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.javiersantos.bottomdialogs.BottomDialog;

/**
 * Created by mis on 02-Nov-17.
 */

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    String data[];

    String dataSub[] = new String[7];

    String dataSubs[] = new String[7];
    private Context Mcontext;


    public ProfileAdapter(String data[],Context context){


        this.Mcontext=context;
        this.data = data;

        dataSub[0] = "An allergy is a hypersensitivity disorder of the immune system. Symptoms include red eyes, itchiness, and runny nose, eczema, hives, or an asthma attack. Allergies can play a major role in conditions such as asthma. In some people, severe allergies to environmental or dietary allergens or to medication may result in life-threatening reactions called anaphylaxis. ";
        dataSub[1] = "Antisocial personality disorder is characterized by a pervasive pattern of disregard for, or violation of, the rights of others. There may be an impoverished moral sense or conscience and a history of crime, legal problems, and impulsive and aggressive behavior. Antisocial personality disorder is the name of the disorder as defined in the Diagnostic and Statistical Manual.";
        dataSub[3] = "Acne vulgaris is a long term skin condition characterized by areas of blackheads, whiteheads, pimples, greasy skin, and possibly scarring. The resulting appearance may lead to anxiety, reduced self-esteem, and in extreme cases, depression or thoughts of suicide. Genetics is estimated to be the cause of 80% of cases. The role of diet as a cause is unclear. Neither cleanliness nor sunlight appear to be involved.";
        dataSub[2] = "Altitude sickness—also known as acute mountain sickness, altitude illness, hypobaropathy, \"the altitude bends\", or soroche—is a pathological effect of high altitude on humans, caused by acute exposure to low partial pressure of oxygen at high altitude. It commonly occurs above 2,400 metres. It presents as a collection of nonspecific symptoms, acquired at high altitude or in low air pressure, resembling a case of \"flu, carbon monoxide poisoning";
        dataSub[4] = "Asthma is a common chronic inflammatory disease of the airways characterized by variable and recurring symptoms, reversible airflow obstruction and bronchospasm. Common symptoms include wheezing, coughing, chest tightness, and shortness of breath. Asthma is thought to be caused by a combination of genetic and environmental factors. Its diagnosis is usually based on the pattern of symptoms, response to therapy over time and spirometry.";
        dataSub[5] = "Back pain is pain felt in the back that usually originates from the muscles, nerves, bones, joints or other structures in the spine. However, internal structures such as the gallbladder and pancreas may also refer pain to the back. Most back pain is felt in the lower back. The remainder of this article considers back pain in all regions. The onset of back pain may be acute or chronic.";
        dataSub[6] = "Autism is a neurodevelopmental disorder characterized by impaired social interaction, verbal and non-verbal communication, and restricted and repetitive behavior. Parents usually notice signs in the first two years of their child's life. The signs typically develop gradually, but some children with autism will reach their developmental milestones at a normal pace and then regress. ";

        dataSubs[0] = "An allergy is a hypersensitivity disorder of the immune system. Symptoms include red eyes, itchiness, and runny nose, eczema, hives, or an asthma attack. Allergies can play a major role in conditions such as asthma.";
        dataSubs[1] = "Antisocial personality disorder is characterized by a pervasive pattern of disregard for, or violation of, the rights of others. There may be an impoverished moral sense or conscience..";
        dataSubs[3] = "Acne vulgaris is a long term skin condition characterized by areas of blackheads, whiteheads, pimples, greasy skin, and possibly scarring. The resulting appearance may lead to anxiety, ";
        dataSubs[2] = "Altitude sickness—also known as acute mountain sickness, altitude illness, hypobaropathy, \"the altitude bends\", or soroche—is a pathological effect of high altitude on humans..";
        dataSubs[4] = "Asthma is a common chronic inflammatory disease of the airways characterized by variable and recurring symptoms, reversible airflow obstruction and bronchospasm. Common symptoms..";
        dataSubs[5] = "Back pain is pain felt in the back that usually originates from the muscles, nerves, bones, joints or other structures in the spine. However, internal structures such as the..";
        dataSubs[6] = "Autism is a neurodevelopmental disorder characterized by impaired social interaction, verbal and non-verbal communication, and restricted and repetitive behavior. Parents usually notice signs in the first two years of their..";
    }


    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profile_item, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ProfileAdapter.ViewHolder holder, final int position) {



        holder.text_view.setText(data[position]);
        holder.sub.setText(dataSubs[position]);


        holder.LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) Mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.data, null);

                ImageView image = (ImageView) customView.findViewById(R.id.image);
                switch (position) {
                    case 0:
                        image.setImageResource(R.drawable.alergy);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();
                        break;
                    case 1:
                        image.setImageResource(R.drawable.pers);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();
                        break;
                    case 2 :
                        image.setImageResource(R.drawable.high);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();

                        break;
                    case 3:
                        image.setImageResource(R.drawable.acne);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();

                        break;
                    case 4:
                        image.setImageResource(R.drawable.asth);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();

                        break;
                    case 5:
                        image.setImageResource(R.drawable.back);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();

                        break;
                    case 6:
                        image.setImageResource(R.drawable.aut);
                        new BottomDialog.Builder(Mcontext)
                                .setTitle(data[position])
                                .setContent(dataSub[position])
                                .setCustomView(customView)
                                // You can also show the custom view with some padding in DP (left, top, right, bottom)
                                //.setCustomView(customView, 20, 20, 20, 0)
                                .show();

                        break;
                }
//                Button dismissButton = (Button) customView.findViewById(R.id.custom_button);


            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView text_view,sub;
        public LinearLayout LinearLayout;
//        final FoldingCell fc ;
        public ViewHolder(View v) {
            super(v);
            text_view = (TextView) v.findViewById(R.id.planet_name);
            sub = (TextView) v.findViewById(R.id.sub);
            LinearLayout = (LinearLayout) v.findViewById(R.id.Layout);
//            (FoldingCell) findViewById(R.id.folding_cell);
        }
    }

}

