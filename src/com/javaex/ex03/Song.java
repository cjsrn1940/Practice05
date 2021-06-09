package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	//1번째 생성자
	public Song() {
		System.out.println("Song(파라미터0개)");
	}
	
	//2번째 생성자
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)");
	}
	
	//3번째 생성자
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터6개)");
	}
	
	
}

/*********************
 SongApp에서 생성자에 String 5개, int 1개의 인자를 주었음으로
 3번째 생성자가 쓰이며 그 중 첫번째로 this(title, artist, album, composer, year); 명령어로 인해 2번째 생성자도 실행이 되는 걸 알 수 있다.
 즉, SongApp실행 결과
 
 Song(파라미터5개)
 Song(파라미터6개)
 
 라고 출력된다.
 ******************************/



