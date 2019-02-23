package com.insightfullogic.java8.examples.chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

public class C3Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		lists.stream().filter( a-> {
			System.out.println("f1 : "+ a);
			return a % 2 == 0;
		}).filter(a -> {
			System.out.println("f2 : "+ a);
			return a % 3 == 0;
		}).collect(Collectors.toList()).stream().max(Comparator.comparing(t -> t));
		Comparator<Integer> comparing = Comparator.comparing(new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return null;
			}
		});
		
		
		List<String> list2 = Arrays.asList("a","b","c");
		List<String> collect = list2.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(Stream.of(1,2,3).reduce((t, u) -> t+u).get());
		System.out.println(Stream.of(1,2,3).reduce(0, (a,b) -> a+b));
		
		countLowwerChar("abcdABCD");
	}
	
	public Set<String> findLongTrack(List<Album> albums){
		return albums.stream().flatMap(a -> a.getTrackList().stream()).filter( a -> a.getLength() > 60).map(a -> a.getName()).collect(Collectors.toSet());
		
	}
	
	int addUp(Stream<Integer> stream) {
		return stream.reduce((x,y) -> x+ y).get();
	}
	
	public List<String> genNameNation(List<Album> albums) {
		return albums.stream().flatMap(a -> a.getMusicianList().stream()).map(a -> a.getName()+":"+a.getNationality()).collect(Collectors.toList());
	}
	
	public List<Album> filterAlbums(List<Album> albums){
		return albums.stream().filter(a -> a.getTrackList().size() <= 3).collect(Collectors.toList());
	}
	
	public int sum(List<Artist> artists) {
		return artists.stream().map(a -> (int)a.getMembers().count()).reduce((x,y) -> x+ y).get();
	}
	
	public void sum(Album album) {
		AtomicInteger a = new AtomicInteger(0);
		album.getMusicianList().forEach(b -> a.incrementAndGet() );
	}
	
	public static void countLowwerChar(String orgin) {
		Stream.of(orgin.toCharArray()).forEach(System.out::println);
	}
}
