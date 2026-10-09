package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class JPCharPart {
    public int CharId;
    public String PartDirection;
    public long PartId;
    public int PartIndex;
    public String PartPath;

    public JPCharPart(long j11, String str, String str2, int i11, int i12) {
        this.PartId = j11;
        this.PartDirection = str;
        this.PartPath = str2;
        this.PartIndex = i11;
        this.CharId = i12;
    }

    public int getCharId() {
        return this.CharId;
    }

    public String getPartDirection() {
        return this.PartDirection;
    }

    public long getPartId() {
        return this.PartId;
    }

    public int getPartIndex() {
        return this.PartIndex;
    }

    public String getPartPath() {
        return this.PartPath;
    }

    public void setCharId(int i11) {
        this.CharId = i11;
    }

    public void setPartDirection(String str) {
        this.PartDirection = str;
    }

    public void setPartId(long j11) {
        this.PartId = j11;
    }

    public void setPartIndex(int i11) {
        this.PartIndex = i11;
    }

    public void setPartPath(String str) {
        this.PartPath = str;
    }

    public JPCharPart() {
    }
}
