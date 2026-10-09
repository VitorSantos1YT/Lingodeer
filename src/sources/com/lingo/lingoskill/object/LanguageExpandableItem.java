package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageExpandableItem extends AbstractExpandableItem<LanguageItem> implements MultiItemEntity {
    public static final int TYPE_GROUP = 0;
    public static final int TYPE_ITEM = 1;
    private String name;

    public LanguageExpandableItem(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LanguageExpandableItem) {
            return ((LanguageExpandableItem) obj).getName().equals(getName());
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 0;
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public int getLevel() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
