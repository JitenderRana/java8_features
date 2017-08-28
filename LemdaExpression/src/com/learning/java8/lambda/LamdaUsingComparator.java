package com.learning.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learning.java8.model.Song;

public class LamdaUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Song> songs = new ArrayList<Song>();
		List<Song> sortedSongs = new ArrayList<Song>();

		Song s1 = new Song();
		s1.setId(2);
		s1.setTitle("Dekha Hazaro daffa");

		Song s2 = new Song();
		s2.setId(5);
		s2.setTitle("Jab tum hote ho");

		Song s3 = new Song();
		s3.setId(6);
		s3.setTitle("ZZZZ");

		songs.add(s1);
		songs.add(s3);
		songs.add(s2);

		Comparator<Song> c = new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};

		/*
		 * Comparator<Song> c1 = new Comparator<Song>() {
		 * 
		 * @Override public int compare(Song o1, Song o2) {
		 * if(o1.getId()>o2.getId()) return 1; else if(o1.getId()<o2.getId())
		 * return 0; else return -1; } };
		 */

		Comparator<Song> c1 = (Song o1, Song o2) -> {
			if (o1.getId() == o2.getId())
				return 0;
			else if (o1.getId() > o2.getId())
				return 1;
			else
				return -1;
		};

		Collections.sort(songs, c1);

		for (Song song : songs) {
			System.out.println(song.getTitle() + "---"+ song.getId());
		}

	}

}
