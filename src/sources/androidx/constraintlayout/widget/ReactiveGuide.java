package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import j4.e;
import j4.t;
import j4.u;
import j4.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1376d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f1373a = -1;
        this.f1374b = false;
        this.f1375c = 0;
        this.f1376d = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36029d);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 3) {
                    this.f1373a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1373a);
                } else if (index == 0) {
                    this.f1374b = typedArrayObtainStyledAttributes.getBoolean(index, this.f1374b);
                } else if (index == 2) {
                    this.f1375c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1375c);
                } else if (index == 1) {
                    this.f1376d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1376d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f1373a != -1) {
            ConstraintLayout.getSharedValues().a(this.f1373a, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.f1375c;
    }

    public int getAttributeId() {
        return this.f1373a;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z11) {
        this.f1374b = z11;
    }

    public void setApplyToConstraintSetId(int i11) {
        this.f1375c = i11;
    }

    public void setAttributeId(int i11) {
        HashSet<WeakReference> hashSet;
        v sharedValues = ConstraintLayout.getSharedValues();
        int i12 = this.f1373a;
        if (i12 != -1 && (hashSet = (HashSet) sharedValues.f36051a.get(Integer.valueOf(i12))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                u uVar = (u) weakReference.get();
                if (uVar == null || uVar == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f1373a = i11;
        if (i11 != -1) {
            sharedValues.a(i11, this);
        }
    }

    public void setGuidelineBegin(int i11) {
        e eVar = (e) getLayoutParams();
        eVar.f35848a = i11;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i11) {
        e eVar = (e) getLayoutParams();
        eVar.f35850b = i11;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f5) {
        e eVar = (e) getLayoutParams();
        eVar.f35852c = f5;
        setLayoutParams(eVar);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1373a = -1;
        this.f1374b = false;
        this.f1375c = 0;
        this.f1376d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1373a = -1;
        this.f1374b = false;
        this.f1375c = 0;
        this.f1376d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
    }
}
