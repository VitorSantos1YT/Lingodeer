package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HorizontalLevel implements MultiItemEntity {
    private int endLevel;
    private int startLevel;

    public int getEndLevel() {
        return this.endLevel;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        if (this.startLevel == 0) {
            return -1;
        }
        return this.endLevel == 100 ? 1 : 0;
    }

    public int getStartLevel() {
        return this.startLevel;
    }

    public void setEndLevel(int i11) {
        this.endLevel = i11;
    }

    public void setStartLevel(int i11) {
        this.startLevel = i11;
    }
}
