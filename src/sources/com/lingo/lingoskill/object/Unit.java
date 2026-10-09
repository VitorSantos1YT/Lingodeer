package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Unit implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<Unit> CREATOR = new Parcelable.Creator<Unit>() { // from class: com.lingo.lingoskill.object.Unit.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Unit createFromParcel(Parcel parcel) {
            return new Unit(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Unit[] newArray(int i11) {
            return new Unit[i11];
        }
    };
    private String Description;
    private String LessonList;
    private int LevelId;
    private int SortIndex;
    private long UnitId;
    private String UnitName;
    private String iconResSuffix;
    private List<Long> unitList;
    private int type = 0;
    private String progress = BuildConfig.VERSION_NAME;
    private boolean isActive = false;
    private boolean preUnitActive = false;
    private boolean nextUnitActive = false;
    private String iconColor = BuildConfig.VERSION_NAME;
    private String dashLineColor = BuildConfig.VERSION_NAME;
    private int bannerRes = 0;
    private String bannerStartColor = BuildConfig.VERSION_NAME;
    private String bannerEndColor = BuildConfig.VERSION_NAME;
    private boolean isCurOpen = false;
    private boolean isTestOutReview = false;

    public Unit(long j11, String str, String str2, String str3, int i11, int i12, String str4) {
        this.UnitId = j11;
        this.UnitName = str;
        this.Description = str2;
        this.LessonList = str3;
        this.SortIndex = i11;
        this.LevelId = i12;
        this.iconResSuffix = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBannerEndColor() {
        return this.bannerEndColor;
    }

    public int getBannerRes() {
        return this.bannerRes;
    }

    public String getBannerStartColor() {
        return this.bannerStartColor;
    }

    public String getDashLineColor() {
        return this.dashLineColor;
    }

    public String getDescription() {
        return FirebaseRemoteConfig.d().f("end_point").equals("lingodeer.com") ? this.Description.replace("https://wap.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css", "https://www.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css").replace("http://wap.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css", "https://www.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css") : this.Description.replace("https://wap.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css", "https://www.lingodeerapp.com/javascript/jsLibrary/richText/css/froala_style.min.css");
    }

    public String getIconColor() {
        return this.iconColor;
    }

    public String getIconResSuffix() {
        return this.iconResSuffix;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.type;
    }

    public String getLessonList() {
        return this.LessonList;
    }

    public int getLevelId() {
        return this.LevelId;
    }

    public String getProgress() {
        return this.progress;
    }

    public int getSortIndex() {
        if (getUnitId() == -1) {
            return 0;
        }
        return this.SortIndex;
    }

    public int getType() {
        return this.type;
    }

    public long getUnitId() {
        return this.UnitId;
    }

    public List<Long> getUnitList() {
        return this.unitList;
    }

    public String getUnitName() {
        String str = this.UnitName;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isCurOpen() {
        return this.isCurOpen;
    }

    public boolean isNextUnitActive() {
        return this.nextUnitActive;
    }

    public boolean isPreUnitActive() {
        return this.preUnitActive;
    }

    public boolean isTestOutReview() {
        return this.isTestOutReview;
    }

    public void setActive(boolean z11) {
        this.isActive = z11;
    }

    public void setBannerEndColor(String str) {
        this.bannerEndColor = str;
    }

    public void setBannerRes(int i11) {
        this.bannerRes = i11;
    }

    public void setBannerStartColor(String str) {
        this.bannerStartColor = str;
    }

    public void setCurOpen(boolean z11) {
        this.isCurOpen = z11;
    }

    public void setDashLineColor(String str) {
        this.dashLineColor = str;
    }

    public void setDescription(String str) {
        this.Description = str;
    }

    public void setIconColor(String str) {
        this.iconColor = str;
    }

    public void setIconResSuffix(String str) {
        this.iconResSuffix = str;
    }

    public void setLessonList(String str) {
        this.LessonList = str;
    }

    public void setLevelId(int i11) {
        this.LevelId = i11;
    }

    public void setNextUnitActive(boolean z11) {
        this.nextUnitActive = z11;
    }

    public void setPreUnitActive(boolean z11) {
        this.preUnitActive = z11;
    }

    public void setProgress(String str) {
        this.progress = str;
    }

    public void setSortIndex(int i11) {
        this.SortIndex = i11;
    }

    public void setTestOutReview(boolean z11) {
        this.isTestOutReview = z11;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setUnitId(long j11) {
        this.UnitId = j11;
    }

    public void setUnitList(List<Long> list) {
        this.unitList = list;
    }

    public void setUnitName(String str) {
        this.UnitName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.UnitId);
        parcel.writeString(this.UnitName);
        parcel.writeString(this.Description);
        parcel.writeString(this.LessonList);
        parcel.writeInt(this.SortIndex);
        parcel.writeInt(this.LevelId);
        parcel.writeString(this.iconResSuffix);
    }

    public Unit() {
    }

    public Unit(Parcel parcel) {
        this.UnitId = parcel.readLong();
        this.UnitName = parcel.readString();
        this.Description = parcel.readString();
        this.LessonList = parcel.readString();
        this.SortIndex = parcel.readInt();
        this.LevelId = parcel.readInt();
        this.iconResSuffix = parcel.readString();
    }
}
