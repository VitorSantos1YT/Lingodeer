package x5;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f55793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f55794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55795c = true;

    public f(TextView textView) {
        this.f55793a = textView;
        this.f55794b = new d(textView);
    }

    @Override // c.a
    public final void E(boolean z11) {
        if (z11) {
            TextView textView = this.f55793a;
            textView.setTransformationMethod(J(textView.getTransformationMethod()));
        }
    }

    @Override // c.a
    public final void F(boolean z11) {
        this.f55795c = z11;
        TextView textView = this.f55793a;
        textView.setTransformationMethod(J(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    @Override // c.a
    public final TransformationMethod J(TransformationMethod transformationMethod) {
        if (this.f55795c) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f55801a : transformationMethod;
    }

    @Override // c.a
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f55795c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i11 = 0; i11 < inputFilterArr.length; i11++) {
                InputFilter inputFilter = inputFilterArr[i11];
                if (inputFilter instanceof d) {
                    sparseArray.put(i11, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (sparseArray.indexOfKey(i13) < 0) {
                    inputFilterArr2[i12] = inputFilterArr[i13];
                    i12++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i14 = 0;
        while (true) {
            d dVar = this.f55794b;
            if (i14 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i14] == dVar) {
                return inputFilterArr;
            }
            i14++;
        }
    }

    @Override // c.a
    public final boolean z() {
        return this.f55795c;
    }
}
