package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ReviewNew implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<ReviewNew> CREATOR = new Parcelable.Creator<ReviewNew>() { // from class: com.lingo.lingoskill.object.ReviewNew.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReviewNew createFromParcel(Parcel parcel) {
            return new ReviewNew(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReviewNew[] newArray(int i11) {
            return new ReviewNew[i11];
        }
    };
    private HwCharacter character;
    private String cwsId;
    private Integer elemType;
    private boolean isChecked;
    private Long lastStudyTime;
    private Sentence sentence;
    private String status;
    private Integer testResultInt;
    private Long unit;
    private Word word;

    public ReviewNew(String str) {
        String[] strArrSplit = str.split(":");
        this.cwsId = strArrSplit[0];
        try {
            this.lastStudyTime = Long.valueOf(strArrSplit[2]);
        } catch (Exception unused) {
            this.lastStudyTime = Long.valueOf(Float.valueOf(strArrSplit[2]).longValue() + 1);
        }
        try {
            this.unit = Long.valueOf(strArrSplit[1]);
        } catch (Exception unused2) {
            this.unit = -1L;
            this.lastStudyTime = Long.valueOf(Long.parseLong(strArrSplit[2]) + 1);
        }
        this.status = String.valueOf(strArrSplit[3]);
        setElemTypeInfo();
    }

    private void setElemTypeInfo() {
        byte b3 = 3;
        String str = this.cwsId.split("_")[1];
        str.getClass();
        switch (str.hashCode()) {
            case 99:
                b3 = !str.equals("c") ? (byte) -1 : (byte) 0;
                break;
            case 115:
                b3 = !str.equals("s") ? (byte) -1 : (byte) 1;
                break;
            case 119:
                b3 = !str.equals("w") ? (byte) -1 : (byte) 2;
                break;
            case 3664:
                if (!str.equals("sc")) {
                    b3 = -1;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                this.elemType = 2;
                break;
            case 1:
                this.elemType = 1;
                break;
            case 2:
                this.elemType = 0;
                break;
            case 3:
                this.elemType = 3;
                break;
            default:
                if (this.cwsId.startsWith("sc_")) {
                    this.elemType = 3;
                }
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReviewNew) {
            return ((ReviewNew) obj).cwsId.equals(this.cwsId);
        }
        return false;
    }

    public HwCharacter getCharacter() {
        return this.character;
    }

    public String getCwsId() {
        return this.cwsId;
    }

    public Integer getElemType() {
        return this.elemType;
    }

    public long getId() {
        try {
            return Long.valueOf(this.cwsId.split("_")[2]).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.elemType.intValue();
    }

    public Long getLastStudyTime() {
        return this.lastStudyTime;
    }

    public int getRememberLevelInt() {
        String str = this.status;
        str.getClass();
        if (str.equals("C")) {
            return 0;
        }
        return !str.equals("D") ? -1 : 1;
    }

    public Sentence getSentence() {
        return this.sentence;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getTestResultInt() {
        return this.testResultInt;
    }

    public Long getUnit() {
        return this.unit;
    }

    public Word getWord() {
        return this.word;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setCharacter(HwCharacter hwCharacter) {
        this.character = hwCharacter;
    }

    public void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public void setCwsId(String str) {
        this.cwsId = str;
    }

    public void setElemType(Integer num) {
        this.elemType = num;
    }

    public void setLastStudyTime(Long l9) {
        this.lastStudyTime = l9;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTestResultInt(Integer num) {
        this.testResultInt = num;
    }

    public void setUnit(Long l9) {
        this.unit = l9;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String toRecord() {
        return this.cwsId + ":" + this.unit + ":" + this.lastStudyTime + ":" + this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.cwsId);
        parcel.writeValue(this.unit);
        parcel.writeValue(this.lastStudyTime);
        parcel.writeString(this.status);
        parcel.writeValue(this.elemType);
        parcel.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
    }

    public ReviewNew(String str, Long l9, Long l11, String str2) {
        this.cwsId = str;
        this.unit = l9;
        this.lastStudyTime = l11;
        this.status = str2;
        setElemTypeInfo();
    }

    public ReviewNew(String str, Long l9, Long l11, String str2, int i11) {
        this.cwsId = str;
        this.unit = l9;
        this.lastStudyTime = l11;
        this.status = str2;
        this.elemType = Integer.valueOf(i11);
    }

    public ReviewNew(String str, Long l9, Long l11, String str2, Integer num) {
        this.cwsId = str;
        this.unit = l9;
        this.lastStudyTime = l11;
        this.status = str2;
        this.elemType = num;
    }

    public ReviewNew() {
    }

    public ReviewNew(Parcel parcel) {
        this.cwsId = parcel.readString();
        this.unit = (Long) parcel.readValue(Long.class.getClassLoader());
        this.lastStudyTime = (Long) parcel.readValue(Long.class.getClassLoader());
        this.status = parcel.readString();
        this.elemType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.isChecked = parcel.readByte() != 0;
    }
}
