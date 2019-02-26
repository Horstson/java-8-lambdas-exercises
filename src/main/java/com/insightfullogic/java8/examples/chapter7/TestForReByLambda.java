package com.insightfullogic.java8.examples.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;

import com.insightfullogic.java8.examples.chapter1.Album;

public class TestForReByLambda {
	private List<Album> albums;

	public TestForReByLambda() {
		albums = new ArrayList<Album>();
	}

	public long countRunningTime() {
//		return this.countFeature(t -> t.getTrackList().stream().mapToLong(x -> x.getLength()).sum());
		return this.countFeature(t -> t.getTrackList().stream().mapToLong(x -> x.getLength()).sum());
	}

	public long countMusicans() {
		return this.albums.stream().map(a -> a.getMusicianList().stream().count()).count();
	}

	public long countFeature(ToLongFunction<Album> function) {
		return this.albums.stream().mapToLong(function).sum();
	}
}
