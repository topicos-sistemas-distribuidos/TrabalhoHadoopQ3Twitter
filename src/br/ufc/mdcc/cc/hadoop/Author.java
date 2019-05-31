package br.ufc.mdcc.cc.hadoop;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Author {

	String memberSince;
	String reviews;
	String ratings;
	String postForum;
	String helpfulVotes;
	String level;

	public String getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getPostForum() {
		return postForum;
	}

	public void setPostForum(String postForum) {
		this.postForum = postForum;
	}

	public String getHelpfulVotes() {
		return helpfulVotes;
	}

	public void setHelpfulVotes(String helpfulVotes) {
		this.helpfulVotes = helpfulVotes;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
