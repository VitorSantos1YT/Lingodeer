package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonFav implements Parcelable {
    public static final Parcelable.Creator<PdLessonFav> CREATOR = new Parcelable.Creator<PdLessonFav>() { // from class: com.lingo.lingoskill.object.PdLessonFav.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdLessonFav createFromParcel(Parcel parcel) {
            return new PdLessonFav(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdLessonFav[] newArray(int i11) {
            return new PdLessonFav[i11];
        }
    };
    private int fav;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21963id;
    private PdLesson pdLesson;
    private Long time;

    public PdLessonFav(String str, Long l9, int i11) {
        this.f21963id = str;
        this.time = l9;
        this.fav = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFav() {
        return this.fav;
    }

    public String getId() {
        return this.f21963id;
    }

    public Long getLessonId() {
        return Long.valueOf(this.f21963id.split("_")[1]);
    }

    public PdLesson getPdLesson() {
        return this.pdLesson;
    }

    public Long getTime() {
        return this.time;
    }

    public void setFav(int i11) {
        this.fav = i11;
    }

    public void setId(String str) {
        this.f21963id = str;
    }

    public void setPdLesson(PdLesson pdLesson) {
        this.pdLesson = pdLesson;
    }

    public void setTime(Long l9) {
        this.time = l9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f21963id);
        parcel.writeValue(this.time);
        parcel.writeInt(this.fav);
        parcel.writeParcelable(this.pdLesson, i11);
    }

    public PdLessonFav() {
    }

    public PdLessonFav(Parcel parcel) {
        this.f21963id = parcel.readString();
        this.time = (Long) parcel.readValue(Long.class.getClassLoader());
        this.fav = parcel.readInt();
        this.pdLesson = (PdLesson) parcel.readParcelable(PdLesson.class.getClassLoader());
    }
}
