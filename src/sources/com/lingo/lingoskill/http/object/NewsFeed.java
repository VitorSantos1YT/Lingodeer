package com.lingo.lingoskill.http.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NewsFeed implements Parcelable {
    public static final Parcelable.Creator<NewsFeed> CREATOR = new Parcelable.Creator<NewsFeed>() { // from class: com.lingo.lingoskill.http.object.NewsFeed.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NewsFeed createFromParcel(Parcel parcel) {
            return new NewsFeed(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NewsFeed[] newArray(int i11) {
            return new NewsFeed[i11];
        }
    };

    @SerializedName("FeedBannar")
    private String feedBannar;

    @SerializedName("FeedContent")
    private String feedContent;

    @SerializedName("FeedId")
    private String feedId;

    @SerializedName("FeedSummary")
    private String feedSummary;

    @SerializedName("FeedTitle")
    private String feedTitle;

    @SerializedName("FeedURL")
    private String feedURL;

    @SerializedName("MemberVisible")
    private String memberVisible;

    @SerializedName("PubDate")
    private String pubDate;

    public NewsFeed() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFeedBannar() {
        return this.feedBannar;
    }

    public String getFeedContent() {
        return this.feedContent;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getFeedSummary() {
        return this.feedSummary;
    }

    public String getFeedTitle() {
        return this.feedTitle;
    }

    public String getFeedURL() {
        return this.feedURL;
    }

    public String getMemberVisible() {
        return this.memberVisible;
    }

    public String getPubDate() {
        return this.pubDate;
    }

    public void readFromParcel(Parcel parcel) {
        this.feedId = parcel.readString();
        this.feedTitle = parcel.readString();
        this.feedSummary = parcel.readString();
        this.feedContent = parcel.readString();
        this.feedURL = parcel.readString();
        this.feedBannar = parcel.readString();
        this.pubDate = parcel.readString();
        this.memberVisible = parcel.readString();
    }

    public void setFeedBannar(String str) {
        this.feedBannar = str;
    }

    public void setFeedContent(String str) {
        this.feedContent = str;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public void setFeedSummary(String str) {
        this.feedSummary = str;
    }

    public void setFeedTitle(String str) {
        this.feedTitle = str;
    }

    public void setFeedURL(String str) {
        this.feedURL = str;
    }

    public void setMemberVisible(String str) {
        this.memberVisible = str;
    }

    public void setPubDate(String str) {
        this.pubDate = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.feedId);
        parcel.writeString(this.feedTitle);
        parcel.writeString(this.feedSummary);
        parcel.writeString(this.feedContent);
        parcel.writeString(this.feedURL);
        parcel.writeString(this.feedBannar);
        parcel.writeString(this.pubDate);
        parcel.writeString(this.memberVisible);
    }

    public NewsFeed(Parcel parcel) {
        this.feedId = parcel.readString();
        this.feedTitle = parcel.readString();
        this.feedSummary = parcel.readString();
        this.feedContent = parcel.readString();
        this.feedURL = parcel.readString();
        this.feedBannar = parcel.readString();
        this.pubDate = parcel.readString();
        this.memberVisible = parcel.readString();
    }
}
