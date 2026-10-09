package com.google.android.material.button;

import bp.h1;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.PdWord;
import dt.g;
import fz.c;
import fz.e;
import java.text.Collator;
import java.util.Comparator;
import m7.r;
import rz.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14099b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14098a = i11;
        this.f14099b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11 = this.f14098a;
        Object obj3 = this.f14099b;
        switch (i11) {
            case 0:
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i12 = MaterialButtonGroup.M;
                int iCompareTo = Boolean.valueOf(materialButton.Q).compareTo(Boolean.valueOf(materialButton2.Q));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
            case 1:
                return ConvertUtilsKt.toCharacterItem$lambda$3((h1) obj3, obj, obj2);
            case 2:
                return ConvertUtilsKt.toCharacterItem$lambda$5((h1) obj3, obj, obj2);
            case 3:
                return ((Number) ((e) obj3).invoke(obj, obj2)).intValue();
            case 4:
                return ((Number) ((g) obj3).invoke(obj, obj2)).intValue();
            case 5:
                return ((Collator) obj3).compare(((PdWord) obj).getDetailWord(), ((PdWord) obj2).getDetailWord());
            case 6:
                r rVar = (r) obj3;
                return rVar.a(obj2) - rVar.a(obj);
            case 7:
                return ((Number) ((w) obj3).invoke(obj, obj2)).intValue();
            case 8:
                return ((Number) ((w) obj3).invoke(obj, obj2)).intValue();
            default:
                for (c cVar : (c[]) obj3) {
                    int i13 = qx.b.i((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (i13 != 0) {
                        return i13;
                    }
                }
                return 0;
        }
    }
}
