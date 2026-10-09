package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OtherSubLanguageExpandableItem extends AbstractExpandableItem<MultiItemEntity> implements MultiItemEntity {
    private Boolean canExpand = Boolean.TRUE;
    private String name;

    public OtherSubLanguageExpandableItem(String str) {
        this.name = str;
    }

    public Boolean getCanExpand() {
        return this.canExpand;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 4;
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public int getLevel() {
        return 2;
    }

    public String getName() {
        return this.name;
    }

    public void setCanExpand(Boolean bool) {
        this.canExpand = bool;
    }

    public void setName(String str) {
        this.name = str;
    }
}
