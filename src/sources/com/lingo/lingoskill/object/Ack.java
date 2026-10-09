package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Ack implements Parcelable {
    public static final Parcelable.Creator<Ack> CREATOR = new Parcelable.Creator<Ack>() { // from class: com.lingo.lingoskill.object.Ack.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ack createFromParcel(Parcel parcel) {
            return new Ack(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ack[] newArray(int i11) {
            return new Ack[i11];
        }
    };
    private String Examples;
    private String Explanation;
    private String GrammarACK;
    private long Id;
    private String Transaltion;
    private long UnitId;
    private boolean isSelected;
    private int sortIndex;

    public Ack(long j11, String str, String str2, String str3, long j12, String str4) {
        this.Id = j11;
        this.GrammarACK = str;
        this.Transaltion = str2;
        this.Explanation = str3;
        this.UnitId = j12;
        this.Examples = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getExamples() {
        return this.Examples;
    }

    public String getExplanation() {
        return this.Explanation;
    }

    public String getGrammarACK() {
        return this.GrammarACK;
    }

    public long getId() {
        return this.Id;
    }

    public int getSortIndex() {
        return this.sortIndex;
    }

    public String getTransaltion() {
        return this.Transaltion;
    }

    public long getUnitId() {
        return this.UnitId;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setExamples(String str) {
        this.Examples = str;
    }

    public void setExplanation(String str) {
        this.Explanation = str;
    }

    public void setGrammarACK(String str) {
        this.GrammarACK = str;
    }

    public void setId(long j11) {
        this.Id = j11;
    }

    public void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    public void setSortIndex(int i11) {
        this.sortIndex = i11;
    }

    public void setTransaltion(String str) {
        this.Transaltion = str;
    }

    public void setUnitId(long j11) {
        this.UnitId = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.Id);
        parcel.writeString(this.GrammarACK);
        parcel.writeString(this.Transaltion);
        parcel.writeString(this.Explanation);
        parcel.writeLong(this.UnitId);
        parcel.writeString(this.Examples);
    }

    public Ack() {
    }

    public Ack(Parcel parcel) {
        this.Id = parcel.readLong();
        this.GrammarACK = parcel.readString();
        this.Transaltion = parcel.readString();
        this.Explanation = parcel.readString();
        this.UnitId = parcel.readLong();
        this.Examples = parcel.readString();
    }
}
