package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import h4.a0;
import h4.d0;
import h4.e;
import h4.h0;
import h4.j;
import h4.q;
import j4.t;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;

    public MotionEffect(Context context) {
        super(context);
        this.P = 0.1f;
        this.Q = 49;
        this.R = 50;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = -1;
        this.W = -1;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:106:0x0217 A[LOOP:3: B:100:0x01eb->B:106:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x021e A[EDGE_INSN: B:118:0x021e->B:107:0x021e BREAK  A[LOOP:3: B:100:0x01eb->B:106:0x0217], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01df  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public final void r(MotionLayout motionLayout, HashMap map) {
        e eVar;
        e eVar2;
        e eVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        d0 d0Var;
        ArrayList arrayList;
        int size;
        int i16;
        int i17;
        h0 h0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i18;
        int[] iArr;
        MotionEffect motionEffect = this;
        HashMap map2 = map;
        int i19 = 1;
        View[] viewArrJ = motionEffect.j((ConstraintLayout) motionEffect.getParent());
        if (viewArrJ == null) {
            g0.q();
            return;
        }
        e eVar4 = new e();
        e eVar5 = new e();
        eVar4.h(Float.valueOf(motionEffect.P), "alpha");
        eVar5.h(Float.valueOf(motionEffect.P), "alpha");
        int i21 = motionEffect.Q;
        eVar4.f31561a = i21;
        eVar5.f31561a = motionEffect.R;
        j jVar = new j();
        jVar.f31561a = i21;
        jVar.m = 0;
        jVar.h(0, "percentX");
        jVar.h(0, "percentY");
        j jVar2 = new j();
        jVar2.f31561a = motionEffect.R;
        jVar2.m = 0;
        jVar2.h(1, "percentX");
        jVar2.h(1, "percentY");
        e eVar6 = null;
        if (motionEffect.S > 0) {
            eVar = new e();
            eVar2 = new e();
            eVar.h(Integer.valueOf(motionEffect.S), "translationX");
            eVar.f31561a = motionEffect.R;
            eVar2.h(0, "translationX");
            eVar2.f31561a = motionEffect.R - 1;
        } else {
            eVar = null;
            eVar2 = null;
        }
        if (motionEffect.T > 0) {
            eVar6 = new e();
            eVar3 = new e();
            eVar6.h(Integer.valueOf(motionEffect.T), "translationY");
            eVar6.f31561a = motionEffect.R;
            eVar3.h(0, "translationY");
            eVar3.f31561a = motionEffect.R - 1;
        } else {
            eVar3 = null;
        }
        int i22 = motionEffect.W;
        if (i22 == -1) {
            int[] iArr2 = new int[4];
            int i23 = 0;
            i12 = 3;
            i13 = 2;
            while (i23 < viewArrJ.length) {
                q qVar = (q) map2.get(viewArrJ[i23]);
                if (qVar == null) {
                    iArr = iArr2;
                    i18 = i19;
                } else {
                    i18 = i19;
                    a0 a0Var = qVar.f31753g;
                    float f5 = a0Var.f31555e;
                    a0 a0Var2 = qVar.f31752f;
                    iArr = iArr2;
                    float f11 = f5 - a0Var2.f31555e;
                    float f12 = a0Var.f31556f - a0Var2.f31556f;
                    if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        iArr[i18] = iArr[i18] + 1;
                    }
                    if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
                i23++;
                i19 = i18;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            i11 = i19;
            int i24 = iArr3[0];
            i22 = 0;
            while (i19 < 4) {
                int i25 = iArr3[i19];
                if (i24 < i25) {
                    i22 = i19;
                    i24 = i25;
                }
                i19++;
            }
        } else {
            i11 = 1;
            i12 = 3;
            i13 = 2;
        }
        int i26 = 0;
        while (i26 < viewArrJ.length) {
            q qVar2 = (q) map2.get(viewArrJ[i26]);
            if (qVar2 == null) {
                i14 = i26;
            } else {
                a0 a0Var3 = qVar2.f31753g;
                float f13 = a0Var3.f31555e;
                a0 a0Var4 = qVar2.f31752f;
                i14 = i26;
                float f14 = f13 - a0Var4.f31555e;
                float f15 = a0Var3.f31556f - a0Var4.f31556f;
                if (i22 == 0) {
                    if (f15 <= CropImageView.DEFAULT_ASPECT_RATIO || (motionEffect.U && f14 != CropImageView.DEFAULT_ASPECT_RATIO)) {
                        i15 = motionEffect.V;
                        if (i15 == -1) {
                            qVar2.a(eVar4);
                            qVar2.a(eVar5);
                            qVar2.a(jVar);
                            qVar2.a(jVar2);
                            if (motionEffect.S > 0) {
                                qVar2.a(eVar);
                                qVar2.a(eVar2);
                            }
                            if (motionEffect.T > 0) {
                                qVar2.a(eVar6);
                                qVar2.a(eVar3);
                            }
                        } else {
                            d0Var = motionLayout.S;
                            if (d0Var != null) {
                                arrayList = (ArrayList) d0Var.f31598q.f518b;
                                size = arrayList.size();
                                i16 = 0;
                                while (true) {
                                    if (i16 < size) {
                                        Object obj = arrayList.get(i16);
                                        i17 = i16 + 1;
                                        h0Var = (h0) obj;
                                        arrayList2 = arrayList;
                                        if (h0Var.f31673a == i15) {
                                            arrayList3 = (ArrayList) h0Var.f31678f.f31672a.get(-1);
                                            if (arrayList3 != null) {
                                                break;
                                            }
                                            qVar2.f31768w.addAll(arrayList3);
                                            break;
                                        }
                                        arrayList = arrayList2;
                                        i16 = i17;
                                    }
                                }
                            }
                        }
                        i26 = i14 + 1;
                        map2 = map;
                        i12 = 3;
                        i13 = 2;
                        i11 = 1;
                        motionEffect = this;
                    }
                } else if (i22 == i11) {
                    if (f15 >= CropImageView.DEFAULT_ASPECT_RATIO || (motionEffect.U && f14 != CropImageView.DEFAULT_ASPECT_RATIO)) {
                        i15 = motionEffect.V;
                        if (i15 == -1) {
                            qVar2.a(eVar4);
                            qVar2.a(eVar5);
                            qVar2.a(jVar);
                            qVar2.a(jVar2);
                            if (motionEffect.S > 0) {
                                qVar2.a(eVar);
                                qVar2.a(eVar2);
                            }
                            if (motionEffect.T > 0) {
                                qVar2.a(eVar6);
                                qVar2.a(eVar3);
                            }
                        } else {
                            d0Var = motionLayout.S;
                            if (d0Var != null) {
                                arrayList = (ArrayList) d0Var.f31598q.f518b;
                                size = arrayList.size();
                                i16 = 0;
                                while (true) {
                                    if (i16 < size) {
                                        Object obj2 = arrayList.get(i16);
                                        i17 = i16 + 1;
                                        h0Var = (h0) obj2;
                                        arrayList2 = arrayList;
                                        if (h0Var.f31673a == i15) {
                                            arrayList3 = (ArrayList) h0Var.f31678f.f31672a.get(-1);
                                            if (arrayList3 != null) {
                                                break;
                                                break;
                                            } else {
                                                qVar2.f31768w.addAll(arrayList3);
                                                break;
                                                break;
                                            }
                                        }
                                        arrayList = arrayList2;
                                        i16 = i17;
                                    }
                                }
                            }
                        }
                        i26 = i14 + 1;
                        map2 = map;
                        i12 = 3;
                        i13 = 2;
                        i11 = 1;
                        motionEffect = this;
                    }
                } else if (i22 != i13) {
                    if (i22 != i12 || f14 <= CropImageView.DEFAULT_ASPECT_RATIO || (motionEffect.U && f15 != CropImageView.DEFAULT_ASPECT_RATIO)) {
                        i15 = motionEffect.V;
                        if (i15 == -1) {
                            qVar2.a(eVar4);
                            qVar2.a(eVar5);
                            qVar2.a(jVar);
                            qVar2.a(jVar2);
                            if (motionEffect.S > 0) {
                                qVar2.a(eVar);
                                qVar2.a(eVar2);
                            }
                            if (motionEffect.T > 0) {
                                qVar2.a(eVar6);
                                qVar2.a(eVar3);
                            }
                        } else {
                            d0Var = motionLayout.S;
                            if (d0Var != null) {
                                arrayList = (ArrayList) d0Var.f31598q.f518b;
                                size = arrayList.size();
                                i16 = 0;
                                while (true) {
                                    if (i16 < size) {
                                        Object obj3 = arrayList.get(i16);
                                        i17 = i16 + 1;
                                        h0Var = (h0) obj3;
                                        arrayList2 = arrayList;
                                        if (h0Var.f31673a == i15) {
                                            arrayList3 = (ArrayList) h0Var.f31678f.f31672a.get(-1);
                                            if (arrayList3 != null) {
                                                break;
                                                break;
                                            } else {
                                                qVar2.f31768w.addAll(arrayList3);
                                                break;
                                                break;
                                            }
                                        }
                                        arrayList = arrayList2;
                                        i16 = i17;
                                    }
                                }
                            }
                        }
                    }
                    i26 = i14 + 1;
                    map2 = map;
                    i12 = 3;
                    i13 = 2;
                    i11 = 1;
                    motionEffect = this;
                } else if (f14 >= CropImageView.DEFAULT_ASPECT_RATIO || (motionEffect.U && f15 != CropImageView.DEFAULT_ASPECT_RATIO)) {
                    i15 = motionEffect.V;
                    if (i15 == -1) {
                        qVar2.a(eVar4);
                        qVar2.a(eVar5);
                        qVar2.a(jVar);
                        qVar2.a(jVar2);
                        if (motionEffect.S > 0) {
                            qVar2.a(eVar);
                            qVar2.a(eVar2);
                        }
                        if (motionEffect.T > 0) {
                            qVar2.a(eVar6);
                            qVar2.a(eVar3);
                        }
                    } else {
                        d0Var = motionLayout.S;
                        if (d0Var != null) {
                            arrayList = (ArrayList) d0Var.f31598q.f518b;
                            size = arrayList.size();
                            i16 = 0;
                            while (true) {
                                if (i16 < size) {
                                    Object obj4 = arrayList.get(i16);
                                    i17 = i16 + 1;
                                    h0Var = (h0) obj4;
                                    arrayList2 = arrayList;
                                    if (h0Var.f31673a == i15) {
                                        arrayList3 = (ArrayList) h0Var.f31678f.f31672a.get(-1);
                                        if (arrayList3 != null) {
                                            break;
                                            break;
                                        } else {
                                            qVar2.f31768w.addAll(arrayList3);
                                            break;
                                            break;
                                        }
                                    }
                                    arrayList = arrayList2;
                                    i16 = i17;
                                }
                            }
                        }
                    }
                    i26 = i14 + 1;
                    map2 = map;
                    i12 = 3;
                    i13 = 2;
                    i11 = 1;
                    motionEffect = this;
                }
            }
            i26 = i14 + 1;
            map2 = map;
            i12 = 3;
            i13 = 2;
            i11 = 1;
            motionEffect = this;
        }
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36043s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 3) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.Q);
                    this.Q = i12;
                    this.Q = Math.max(Math.min(i12, 99), 0);
                } else if (index == 1) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.R);
                    this.R = i13;
                    this.R = Math.max(Math.min(i13, 99), 0);
                } else if (index == 5) {
                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                } else if (index == 6) {
                    this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                } else if (index == 0) {
                    this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                } else if (index == 2) {
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                } else if (index == 4) {
                    this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                } else if (index == 7) {
                    this.V = typedArrayObtainStyledAttributes.getResourceId(index, this.V);
                }
            }
            int i14 = this.Q;
            int i15 = this.R;
            if (i14 == i15) {
                if (i14 > 0) {
                    this.Q = i14 - 1;
                } else {
                    this.R = i15 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = 0.1f;
        this.Q = 49;
        this.R = 50;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = -1;
        this.W = -1;
        s(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.P = 0.1f;
        this.Q = 49;
        this.R = 50;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = -1;
        this.W = -1;
        s(context, attributeSet);
    }
}
