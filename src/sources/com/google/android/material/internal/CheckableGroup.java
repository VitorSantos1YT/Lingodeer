package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14591a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f14592b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnCheckedStateChangeListener f14593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14595e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnCheckedStateChangeListener {
        void a();
    }

    public final void a(Chip chip) {
        this.f14591a.put(Integer.valueOf(chip.getId()), chip);
        if (chip.isChecked()) {
            b(chip);
        }
        chip.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<MaterialCheckable<Object>>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public final void a(Object obj, boolean z11) {
                MaterialCheckable materialCheckable = (MaterialCheckable) obj;
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (z11) {
                    if (!checkableGroup.b(materialCheckable)) {
                        return;
                    }
                } else if (!checkableGroup.e(materialCheckable, checkableGroup.f14595e)) {
                    return;
                }
                OnCheckedStateChangeListener onCheckedStateChangeListener = checkableGroup.f14593c;
                if (onCheckedStateChangeListener != null) {
                    new HashSet(checkableGroup.f14592b);
                    onCheckedStateChangeListener.a();
                }
            }
        });
    }

    public final boolean b(MaterialCheckable materialCheckable) {
        int id2 = materialCheckable.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f14592b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.f14591a.get(Integer.valueOf(d()));
        if (materialCheckable2 != null) {
            e(materialCheckable2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList c(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f14592b);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof MaterialCheckable) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int d() {
        if (!this.f14594d) {
            return -1;
        }
        HashSet hashSet = this.f14592b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final boolean e(MaterialCheckable materialCheckable, boolean z11) {
        int id2 = materialCheckable.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f14592b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z11 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }
}
