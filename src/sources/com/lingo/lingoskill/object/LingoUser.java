package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LingoUser implements Parcelable {
    public static final Parcelable.Creator<LingoUser> CREATOR = new Parcelable.Creator<LingoUser>() { // from class: com.lingo.lingoskill.object.LingoUser.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LingoUser createFromParcel(Parcel parcel) {
            return new LingoUser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LingoUser[] newArray(int i11) {
            return new LingoUser[i11];
        }
    };
    private boolean allowFollow;
    private int followee;
    private int grammarModeXp;
    private String guid;
    private boolean isMyFriend;
    private String nick;
    private int pinyinModeXp;
    private int toneModeXp;
    private int totalXp;
    private int userId;
    private int wordModeXp;

    public LingoUser() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFollowee() {
        return this.followee;
    }

    public int getGrammarModeXp() {
        return this.grammarModeXp;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getNick() {
        return this.nick;
    }

    public int getPinyinModeXp() {
        return this.pinyinModeXp;
    }

    public int getToneModeXp() {
        return this.toneModeXp;
    }

    public int getTotalXp() {
        return this.totalXp;
    }

    public int getUserId() {
        return this.userId;
    }

    public int getWordModeXp() {
        return this.wordModeXp;
    }

    public boolean isAllowFollow() {
        return this.allowFollow;
    }

    public boolean isMyFriend() {
        return this.isMyFriend;
    }

    public void setAllowFollow(boolean z11) {
        this.allowFollow = z11;
    }

    public void setFollowee(int i11) {
        this.followee = i11;
    }

    public void setGrammarModeXp(int i11) {
        this.grammarModeXp = i11;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setMyFriend(boolean z11) {
        this.isMyFriend = z11;
    }

    public void setNick(String str) {
        this.nick = str;
    }

    public void setPinyinModeXp(int i11) {
        this.pinyinModeXp = i11;
    }

    public void setToneModeXp(int i11) {
        this.toneModeXp = i11;
    }

    public void setTotalXp(int i11) {
        this.totalXp = i11;
    }

    public void setUserId(int i11) {
        this.userId = i11;
    }

    public void setWordModeXp(int i11) {
        this.wordModeXp = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.userId);
        parcel.writeString(this.guid);
        parcel.writeString(this.nick);
        parcel.writeInt(this.followee);
        parcel.writeByte(this.allowFollow ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMyFriend ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.totalXp);
        parcel.writeInt(this.grammarModeXp);
        parcel.writeInt(this.pinyinModeXp);
        parcel.writeInt(this.toneModeXp);
        parcel.writeInt(this.wordModeXp);
    }

    public LingoUser(Parcel parcel) {
        this.userId = parcel.readInt();
        this.guid = parcel.readString();
        this.nick = parcel.readString();
        this.followee = parcel.readInt();
        this.allowFollow = parcel.readByte() != 0;
        this.isMyFriend = parcel.readByte() != 0;
        this.totalXp = parcel.readInt();
        this.grammarModeXp = parcel.readInt();
        this.pinyinModeXp = parcel.readInt();
        this.toneModeXp = parcel.readInt();
        this.wordModeXp = parcel.readInt();
    }
}
