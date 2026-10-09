package cn;

import android.widget.RadioGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.h2;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji.e f7186b;

    public /* synthetic */ a(ji.e eVar, int i11) {
        this.f7185a = i11;
        this.f7186b = eVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
        switch (this.f7185a) {
            case 0:
                b bVar = (b) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    bVar.r().koDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    bVar.r().koDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    bVar.r().koDisPlay = 2;
                }
                bVar.r().updateEntry("koDisPlay");
                break;
            case 1:
                e eVar = (e) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    eVar.r().koDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    eVar.r().koDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    eVar.r().koDisPlay = 2;
                }
                eVar.r().updateEntry("koDisPlay");
                break;
            case 2:
                f fVar = (f) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    fVar.r().koDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    fVar.r().koDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    fVar.r().koDisPlay = 2;
                }
                fVar.r().updateEntry("koDisPlay");
                break;
            case 3:
                gj.a aVar = (gj.a) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    aVar.r().csDisplay = 0;
                } else if (i11 == R.id.rb_model2) {
                    aVar.r().csDisplay = 1;
                } else if (i11 == R.id.rb_model3) {
                    aVar.r().csDisplay = 2;
                }
                aVar.r().updateEntry("csDisplay");
                break;
            case 4:
                gj.d dVar = (gj.d) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    dVar.r().csDisplay = 0;
                } else if (i11 == R.id.rb_model2) {
                    dVar.r().csDisplay = 1;
                } else if (i11 == R.id.rb_model3) {
                    dVar.r().csDisplay = 2;
                }
                dVar.r().updateEntry("csDisplay");
                break;
            case 5:
                gj.e eVar2 = (gj.e) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    eVar2.r().csDisplay = 0;
                } else if (i11 == R.id.rb_model2) {
                    eVar2.r().csDisplay = 1;
                } else if (i11 == R.id.rb_model3) {
                    eVar2.r().csDisplay = 2;
                }
                eVar2.r().updateEntry("csDisplay");
                break;
            case 6:
                jm.a aVar2 = (jm.a) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    aVar2.r().jsDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    aVar2.r().jsDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    aVar2.r().jsDisPlay = 2;
                } else if (i11 == R.id.rb_model4) {
                    aVar2.r().jsDisPlay = 3;
                } else if (i11 == R.id.rb_model5) {
                    aVar2.r().jsDisPlay = 4;
                } else if (i11 == R.id.rb_model6) {
                    aVar2.r().jsDisPlay = 5;
                } else if (i11 == R.id.rb_model7) {
                    aVar2.r().jsDisPlay = 6;
                }
                aVar2.r().updateEntry("jsDisPlay");
                break;
            case 7:
                jm.d dVar2 = (jm.d) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    dVar2.r().jsDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    dVar2.r().jsDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    dVar2.r().jsDisPlay = 2;
                } else if (i11 == R.id.rb_model4) {
                    dVar2.r().jsDisPlay = 3;
                } else if (i11 == R.id.rb_model5) {
                    dVar2.r().jsDisPlay = 4;
                } else if (i11 == R.id.rb_model6) {
                    dVar2.r().jsDisPlay = 5;
                } else if (i11 == R.id.rb_model7) {
                    dVar2.r().jsDisPlay = 6;
                }
                dVar2.r().updateEntry("jsDisPlay");
                break;
            case 8:
                jm.e eVar3 = (jm.e) this.f7186b;
                m.f(radioGroup, "<unused var>");
                if (i11 == R.id.rb_model1) {
                    eVar3.r().jsDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    eVar3.r().jsDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    eVar3.r().jsDisPlay = 2;
                } else if (i11 == R.id.rb_model4) {
                    eVar3.r().jsDisPlay = 3;
                } else if (i11 == R.id.rb_model5) {
                    eVar3.r().jsDisPlay = 4;
                } else if (i11 == R.id.rb_model6) {
                    eVar3.r().jsDisPlay = 5;
                } else if (i11 == R.id.rb_model7) {
                    eVar3.r().jsDisPlay = 6;
                }
                eVar3.r().updateEntry("jsDisPlay");
                break;
            default:
                qh.m mVar = (qh.m) this.f7186b;
                m.f(radioGroup, "<unused var>");
                e0.B(LifecycleOwnerKt.getLifecycleScope(mVar), null, null, new h2(i11, mVar, (vy.d) null, 10), 3);
                break;
        }
    }
}
