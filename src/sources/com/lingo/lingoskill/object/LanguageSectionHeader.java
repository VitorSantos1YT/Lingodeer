package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageSectionHeader implements MultiItemEntity {
    private String name;

    public LanguageSectionHeader(String str) {
        this.name = str;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
