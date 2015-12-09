package com.indielink.indielink;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.facebook.AccessToken;
import com.indielink.indielink.Network.HttpPost;
import com.indielink.indielink.Profile.ProfileContent;

import org.json.JSONArray;
import org.json.JSONException;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EditProfileFragment extends Fragment{

    private EditText aboutMe;
    private CheckBox isVocal, isGuitar, isBass, isDrum, isKeyboard,isOther;
    private ArrayList<String> TrackScoreList, TrackStyleList;
    private ArrayList<Integer> TrackRadioGpIdList;

    private OnFragmentInteractionListener mListener;

    public static EditProfileFragment newInstance(String param1, String param2) {
        EditProfileFragment fragment = new EditProfileFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public EditProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        final MediaPlayer player1 = MediaPlayer.create(getActivity(), R.raw.track1rumine);
        final MediaPlayer player2 = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
        final MediaPlayer player3 = MediaPlayer.create(getActivity(), R.raw.track3smokeonthewater);
        final MediaPlayer player4 = MediaPlayer.create(getActivity(), R.raw.track4takeiteasy);
        final MediaPlayer player5 = MediaPlayer.create(getActivity(), R.raw.track5thislove);
        final MediaPlayer player6 = MediaPlayer.create(getActivity(), R.raw.track6masterofpuppets);
        final MediaPlayer player7 = MediaPlayer.create(getActivity(), R.raw.track7hittheroadjack);
        final MediaPlayer player8 = MediaPlayer.create(getActivity(), R.raw.track8bringitonhome);
        final MediaPlayer player9 = MediaPlayer.create(getActivity(), R.raw.track9goodbye);

        aboutMe = (EditText) view.findViewById(R.id.EditMusicianAboutMe);

        //play track 1
        Button play1 = (Button) view.findViewById(R.id.profileplaytrack1button);
        play1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player1.start();
            }
        });
        //stop track1
        Button stop1 = (Button) view.findViewById(R.id.profilestoptrack1button);
        stop1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player1.pause();
                player1.seekTo(player1.getCurrentPosition());
            }
        });

        //play track 2
        Button play2 = (Button) view.findViewById(R.id.profileplaytrack2button);
        play2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player2.start();
            }
        });
        //stop track2
        Button stop2 = (Button) view.findViewById(R.id.profilestoptrack2button);
        stop2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player2.pause();
                player2.seekTo(player2.getCurrentPosition());
            }
        });

        //play track 3
        Button play3 = (Button) view.findViewById(R.id.profileplaytrack3button);
        play3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player3.start();
            }
        });
        //stop track3
        Button stop3 = (Button) view.findViewById(R.id.profilestoptrack3button);
        stop3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player3.pause();
                player3.seekTo(0);
            }
        });

        //play track 4
        Button play4 = (Button) view.findViewById(R.id.profileplaytrack4button);
        play4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player4.start();
            }
        });
        //stop track4
        Button stop4 = (Button) view.findViewById(R.id.profilestoptrack4button);
        stop4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player4.pause();
                player4.seekTo(0);
            }
        });

        //play track 5
        Button play5 = (Button) view.findViewById(R.id.profileplaytrack5button);
        play5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player5.start();
            }
        });
        //stop track5
        Button stop5 = (Button) view.findViewById(R.id.profilestoptrack5button);
        stop5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player5.pause();
                player5.seekTo(0);
            }
        });

        //play track 6
        Button play6 = (Button) view.findViewById(R.id.profileplaytrack6button);
        play6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player6.start();
            }
        });
        //stop track6
        Button stop6 = (Button) view.findViewById(R.id.profilestoptrack6button);
        stop6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player6.pause();
                player6.seekTo(0);
            }
        });

        //play track7
        Button play7 = (Button) view.findViewById(R.id.profileplaytrack7button);
        play7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player7.start();
            }
        });
        //stop track7
        Button stop7 = (Button) view.findViewById(R.id.profilestoptrack7button);
        stop7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player7.pause();
                player7.seekTo(0);
            }
        });

        //play track 8
        Button play8 = (Button) view.findViewById(R.id.profileplaytrack8button);
        play8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player8.start();
            }
        });
        //stop track8
        Button stop8 = (Button) view.findViewById(R.id.profilestoptrack8button);
        stop8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player8.pause();
                player8.seekTo(0);
            }
        });

        //play track 9
        Button play9 = (Button) view.findViewById(R.id.profileplaytrack9button);
        play9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.track2getlucky);
                player9.start();
            }
        });
        //stop track9
        Button stop9 = (Button) view.findViewById(R.id.profilestoptrack9button);
        stop9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //MediaPlayer myMediaPlayer = MediaPlayer.create(getActivity(), R.raw.track1rumine);
                player9.pause();
                player9.seekTo(0);
            }
        });



        //Construct ArrayList first
        TrackScoreList = new ArrayList<String>();
        TrackRadioGpIdList = new ArrayList<Integer>(Arrays.asList(
                R.id.track1RadioGp,
                R.id.track2RadioGp,
                R.id.track3RadioGp,
                R.id.track4RadioGp,
                R.id.track5RadioGp,
                R.id.track6RadioGp,
                R.id.track7RadioGp,
                R.id.track8RadioGp,
                R.id.track9RadioGp
        ));

        //for Instruemnt JSONArray
        isVocal = (CheckBox) view.findViewById(R.id.EditProfileisVocal);
        isGuitar = (CheckBox) view.findViewById(R.id.EditProfileisGuitar);
        isBass = (CheckBox) view.findViewById(R.id.EditProfileisBass);
        isDrum = (CheckBox) view.findViewById(R.id.EditProfileisDrum);
        isKeyboard = (CheckBox) view.findViewById(R.id.EditProfileisKeyboard);
        isOther = (CheckBox) view.findViewById(R.id.EditProfileisOthers);

        // Set button onClick Handler
        final Button button = (Button) view.findViewById(R.id.SubmitNewBand);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Adding marked track score to track score arraylist
                for (int i = 0; i < 9; i++) {
                    RadioGroup rg = (RadioGroup) view.findViewById(TrackRadioGpIdList.get(i));
                    TrackScoreList.add(((RadioButton) view.findViewById(
                            rg.getCheckedRadioButtonId())).getText().toString());
                }

                //make instrument JsonArray
                JSONArray InstrumentArrayList = new JSONArray();
                if (isVocal.isChecked()) InstrumentArrayList.put("vocal");
                if (isGuitar.isChecked()) InstrumentArrayList.put("guitar");
                if (isBass.isChecked()) InstrumentArrayList.put("bass");
                if (isDrum.isChecked()) InstrumentArrayList.put("drum");
                if (isKeyboard.isChecked()) InstrumentArrayList.put("keyboard");
                if (isOther.isChecked()) InstrumentArrayList.put("other");
                //if(isOther.isChecked())list.put("something");

                //contruct track style list
                TrackStyleList = new ArrayList<String>(Arrays.asList(
                        "blues", "country", "electronic", "hard_rock",
                        "britpop", "jazz", "pop_rock", "metal", "post_rock"
                ));

                //make JSONObject for http post
                JSONObject obj = new JSONObject();
                try {
                    //adding name, age, gender, profile pic url
                    obj.put("profile_picture_url", ProfileContent.ProfilePictureURL);
                    //adding element to JSON for posting
                    obj.put("about_me", aboutMe.getText());
                    obj.put("access_token", AccessToken.getCurrentAccessToken().getToken());
                    obj.put("fb_user_id", AccessToken.getCurrentAccessToken().getUserId());

                    //adding score mark
                    for (int i = 0; i < 9; i++)
                        obj.put(TrackStyleList.get(i), TrackScoreList.get(i));

                    //add instrument arrayList
                    obj.put("instrument", InstrumentArrayList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                //Post to server
                aboutMe.setText(obj.toString());
                HttpPost httpPost = new HttpPost();
                JSONObject response = httpPost.PostJSONResponseJSON("http://137.189.97.88:8080/user/edit", obj);
                try {
                    response.getString("status");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

}
