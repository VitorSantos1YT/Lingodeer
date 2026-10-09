package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseReviewGroup extends AbstractExpandableItem<ReviewNew> implements MultiItemEntity {
    public String iconResSuffix;
    public boolean isChecked;
    public float strength;
    public String unitName;

    public static float getUnitStrength(List<ReviewNew> list) {
        Iterator<ReviewNew> it = list.iterator();
        float rememberLevelInt = CropImageView.DEFAULT_ASPECT_RATIO;
        while (it.hasNext()) {
            rememberLevelInt += it.next().getRememberLevelInt();
        }
        return rememberLevelInt / list.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof BaseReviewGroup) && ((BaseReviewGroup) obj).getUnitName().equals(this.unitName);
    }

    public String getIconResSuffix() {
        return this.iconResSuffix;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return -1;
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public int getLevel() {
        return 0;
    }

    public float getStrength() {
        return this.strength;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public void setIconResSuffix(String str) {
        this.iconResSuffix = str;
    }

    public void setStrength(float f5) {
        this.strength = f5;
    }

    public void setUnitName(String str) {
        this.unitName = str;
    }
}
