package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageItemList implements MultiItemEntity {
    List<LanguageItem> items;
    List<Integer> posTags;

    public LanguageItemList(List<LanguageItem> list) {
        this.items = list;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 1;
    }

    public List<LanguageItem> getItems() {
        return this.items;
    }

    public List<Integer> getPosTags() {
        return this.posTags;
    }

    public void setItems(List<LanguageItem> list) {
        this.items = list;
    }

    public void setPosTags(List<Integer> list) {
        this.posTags = list;
    }
}
