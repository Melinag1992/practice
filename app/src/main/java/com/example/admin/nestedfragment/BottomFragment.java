package com.example.admin.nestedfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {

    private View rootview;
    private RecyclerView booksRecyclerView;
    private ModelAdapter bookAdapter;
    private List<Books> bookList;



    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_bottom, container, false);


        booksRecyclerView = rootview.findViewById(R.id.book_recycler);
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        setJson();
        parseJson();




        return rootview;



    }
    public  void setJson(){

        try {
            JSONObject jsonObject = new JSONObject("{\n" +
                    "  \"books\": [\n" +
                    "    {\n" +
                    "      \"title\": \"Northanger Abbey\",\n" +
                    "      \"author\": \"Austen, Jane\",\n" +
                    "      \"year\": 1814\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"War and Peace\",\n" +
                    "      \"author\": \"Tolstoy, Leo\",\n" +
                    "      \"year\": 1865\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Anna Karenina\",\n" +
                    "      \"author\": \"Tolstoy, Leo\",\n" +
                    "      \"year\": 1875\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Mrs. Dalloway\",\n" +
                    "      \"author\": \"Woolf, Virginia\",\n" +
                    "      \"year\": 1925\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"The Hours\",\n" +
                    "      \"author\": \"Cunnningham, Michael\",\n" +
                    "      \"year\": 1999\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Huckleberry Finn\",\n" +
                    "      \"author\": \"Twain, Mark\",\n" +
                    "      \"year\": 1865\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Bleak House\",\n" +
                    "      \"author\": \"Dickens, Charles\",\n" +
                    "      \"year\": 1870\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Tom Sawyer\",\n" +
                    "      \"author\": \"Twain, Mark\",\n" +
                    "      \"year\": 1862\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}\n");
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void parseJson(){
        try {
            JSONObject jsonArray = new JSONObject("{\n" +
                    "  \"books\": [\n" +
                    "    {\n" +
                    "      \"title\": \"Northanger Abbey\",\n" +
                    "      \"author\": \"Austen, Jane\",\n" +
                    "      \"year\": 1814\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"War and Peace\",\n" +
                    "      \"author\": \"Tolstoy, Leo\",\n" +
                    "      \"year\": 1865\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Anna Karenina\",\n" +
                    "      \"author\": \"Tolstoy, Leo\",\n" +
                    "      \"year\": 1875\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Mrs. Dalloway\",\n" +
                    "      \"author\": \"Woolf, Virginia\",\n" +
                    "      \"year\": 1925\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"The Hours\",\n" +
                    "      \"author\": \"Cunnningham, Michael\",\n" +
                    "      \"year\": 1999\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Huckleberry Finn\",\n" +
                    "      \"author\": \"Twain, Mark\",\n" +
                    "      \"year\": 1865\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Bleak House\",\n" +
                    "      \"author\": \"Dickens, Charles\",\n" +
                    "      \"year\": 1870\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"title\": \"Tom Sawyer\",\n" +
                    "      \"author\": \"Twain, Mark\",\n" +
                    "      \"year\": 1862\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}\n");
            for (int i = 0; i <jsonArray.length() ; i++) {
                JSONObject book = jsonArray.getJSONObject("books");

                String booktitle = book.getString("title");
                Log.d(TAG, "parseJson: "+ booktitle);
                String bookAuthor = book.getString("author");
                int year = book.getInt("year");


            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
