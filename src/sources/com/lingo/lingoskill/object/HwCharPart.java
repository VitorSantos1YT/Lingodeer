package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharPart {
    private long CharId;
    private String PartDirection;
    private long PartId;
    private int PartIndex;
    private String PartPath;

    public HwCharPart(long j11, long j12, int i11, String str, String str2) {
        this.PartId = j11;
        this.CharId = j12;
        this.PartIndex = i11;
        this.PartDirection = str;
        this.PartPath = str2;
    }

    public long getCharId() {
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

    public void setCharId(long j11) {
        this.CharId = j11;
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

    public HwCharPart() {
    }
}
