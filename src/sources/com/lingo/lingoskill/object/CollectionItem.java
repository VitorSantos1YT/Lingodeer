package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CollectionItem {
    private int count;
    private String info;
    private boolean isComplete;
    private int type;

    public CollectionItem() {
    }

    public int getCount() {
        return this.count;
    }

    public String getInfo() {
        return this.info;
    }

    public int getType() {
        return this.type;
    }

    public boolean isComplete() {
        return this.isComplete;
    }

    public void setComplete(boolean z11) {
        this.isComplete = z11;
    }

    public void setCount(int i11) {
        this.count = i11;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public CollectionItem(String str, int i11, boolean z11) {
        this.info = str;
        this.type = i11;
        this.isComplete = z11;
    }
}
