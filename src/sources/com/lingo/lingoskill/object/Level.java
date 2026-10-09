package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Level {
    private long LevelId;
    private String LevelName;
    private String UnitList;

    public Level(long j11, String str, String str2) {
        this.LevelId = j11;
        this.LevelName = str;
        this.UnitList = str2;
    }

    public long getLevelId() {
        return this.LevelId;
    }

    public String getLevelName() {
        return this.LevelName;
    }

    public String getUnitList() {
        return this.UnitList;
    }

    public void setLevelId(long j11) {
        this.LevelId = j11;
    }

    public void setLevelName(String str) {
        this.LevelName = str;
    }

    public void setUnitList(String str) {
        this.UnitList = str;
    }

    public Level() {
    }
}
