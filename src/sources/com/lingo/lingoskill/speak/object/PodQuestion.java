package com.lingo.lingoskill.speak.object;

import java.util.List;
import op.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PodQuestion<T extends a> {
    private List<PodSelect<T>> determine;
    private List<PodSelect<T>> select;

    public List<PodSelect<T>> getDetermine() {
        return this.determine;
    }

    public List<PodSelect<T>> getSelect() {
        return this.select;
    }

    public void setDetermine(List<PodSelect<T>> list) {
        this.determine = list;
    }

    public void setSelect(List<PodSelect<T>> list) {
        this.select = list;
    }
}
