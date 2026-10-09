package hh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import hj.d2;
import hj.i6;
import hj.r5;
import hj.x3;
import java.util.ArrayList;
import qp.d3;
import qp.k2;
import qp.p3;
import qp.z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32295b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f32294a = i11;
        this.f32295b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        String string;
        String string2;
        int i11 = this.f32294a;
        Object obj = this.f32295b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj;
                if (s3 == null || (string = s3.toString()) == null || (string2 = oz.q.i1(string).toString()) == null || string2.length() <= 0) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                break;
            case 1:
                ((j0) obj).z();
                break;
            case 2:
                kotlin.jvm.internal.m.f(s3, "s");
                qp.b0 b0Var = (qp.b0) obj;
                mp.b bVar = b0Var.f47881a;
                if (b0Var.f47837l.size() <= 0) {
                    ((jp.p0) bVar).O(6);
                } else {
                    ((jp.p0) bVar).O(4);
                }
                break;
            case 3:
                ((k2) obj).r();
                break;
            case 4:
                kotlin.jvm.internal.m.f(s3, "s");
                z2 z2Var = (z2) obj;
                mp.b bVar2 = z2Var.f47881a;
                if (z2Var.f48289l.size() <= 0) {
                    ((jp.p0) bVar2).O(6);
                } else {
                    ((jp.p0) bVar2).O(4);
                }
                break;
            case 5:
                kotlin.jvm.internal.m.f(s3, "s");
                break;
            case 6:
                kotlin.jvm.internal.m.f(s3, "s");
                p3 p3Var = (p3) obj;
                ArrayList arrayList = p3Var.f48119n;
                ArrayList arrayList2 = p3Var.m;
                mp.b bVar3 = p3Var.f47881a;
                int[] iArr = bq.r.f4959a;
                if (bq.m.H()) {
                    int i12 = p3Var.f47884d.keyLanguage;
                    if (i12 == 0 || i12 == 11) {
                        if (arrayList2.size() != arrayList.size()) {
                            ((jp.p0) bVar3).O(0);
                        } else {
                            ((jp.p0) bVar3).O(4);
                        }
                    } else if (arrayList2.size() > 0) {
                        ((jp.p0) bVar3).O(4);
                    }
                } else if (arrayList2.size() != arrayList.size()) {
                    ((jp.p0) bVar3).O(0);
                } else {
                    ((jp.p0) bVar3).O(4);
                }
                break;
            case 7:
            case 8:
                break;
            case 9:
                g1.k kVar = (g1.k) obj;
                if (s3 != null && s3.length() > 0) {
                    ((x3) kVar.f28529b).f33578k.f32724b.setEnabled(true);
                } else {
                    i6 i6Var = ((x3) kVar.f28529b).f33578k;
                    i6Var.f32724b.setEnabled(i6Var.f32725c.isChecked());
                }
                break;
            default:
                ((r5) ((ob.i) obj).f44813b).f33230c.f32724b.setEnabled(s3 != null && s3.length() > 0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i11, int i12, int i13) {
        switch (this.f32294a) {
            case 2:
            case 4:
            case 5:
            case 6:
                kotlin.jvm.internal.m.f(s3, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i11, int i12, int i13) {
        switch (this.f32294a) {
            case 2:
                kotlin.jvm.internal.m.f(s3, "s");
                break;
            case 4:
                kotlin.jvm.internal.m.f(s3, "s");
                break;
            case 5:
                kotlin.jvm.internal.m.f(s3, "s");
                d3 d3Var = (d3) this.f32295b;
                ta.a aVar = d3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                if (!TextUtils.isEmpty(((d2) aVar).f32482c.getText().toString())) {
                    ((jp.p0) d3Var.f47881a).O(4);
                } else {
                    ((jp.p0) d3Var.f47881a).O(0);
                }
                break;
            case 6:
                kotlin.jvm.internal.m.f(s3, "s");
                break;
            case 7:
                SearchView searchView = (SearchView) this.f32295b;
                Editable text = searchView.R.getText();
                searchView.A0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i14 = 8;
                if (searchView.f993z0 && !searchView.f986s0 && zIsEmpty) {
                    searchView.W.setVisibility(8);
                    i14 = 0;
                }
                searchView.f969b0.setVisibility(i14);
                searchView.r();
                searchView.u();
                s3.toString();
                break;
            case 8:
                ((oc.a) this.f32295b).invoke(s3);
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void d(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void e(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void f(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void g(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void h(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void i(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void j(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void k(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void l(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void m(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void n(int i11, int i12, int i13, CharSequence charSequence) {
    }
}
