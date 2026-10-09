package lp;

import android.widget.RadioGroup;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.env.FontSizeStyleKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dm.c f40187b;

    public /* synthetic */ d(dm.c cVar, int i11) {
        this.f40186a = i11;
        this.f40187b = cVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
        switch (this.f40186a) {
            case 0:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar.f23491c).hindiDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar.f23491c).hindiDisPlay = 1;
                }
                ((Env) cVar.f23491c).updateEntry("hindiDisPlay");
                break;
            case 1:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar2 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar2.f23491c).koDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar2.f23491c).koDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    ((Env) cVar2.f23491c).koDisPlay = 2;
                }
                ((Env) cVar2.f23491c).updateEntry("koDisPlay");
                break;
            case 2:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar3 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar3.f23491c).arDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar3.f23491c).arDisPlay = 1;
                }
                ((Env) cVar3.f23491c).updateEntry("arDisPlay");
                break;
            case 3:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar4 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar4.f23491c).jsDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar4.f23491c).jsDisPlay = 1;
                } else if (i11 == R.id.rb_model3) {
                    ((Env) cVar4.f23491c).jsDisPlay = 2;
                } else if (i11 == R.id.rb_model4) {
                    ((Env) cVar4.f23491c).jsDisPlay = 3;
                } else if (i11 == R.id.rb_model5) {
                    ((Env) cVar4.f23491c).jsDisPlay = 4;
                } else if (i11 == R.id.rb_model6) {
                    ((Env) cVar4.f23491c).jsDisPlay = 5;
                } else if (i11 == R.id.rb_model7) {
                    ((Env) cVar4.f23491c).jsDisPlay = 6;
                }
                ((Env) cVar4.f23491c).updateEntry("jsDisPlay");
                break;
            case 4:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar5 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar5.f23491c).grkDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar5.f23491c).grkDisPlay = 1;
                }
                ((Env) cVar5.f23491c).updateEntry("greDisPlay");
                break;
            case 5:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar6 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar6.f23491c).thaiDisPlay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar6.f23491c).thaiDisPlay = 1;
                }
                ((Env) cVar6.f23491c).updateEntry("thaiDisPlay");
                break;
            case 6:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar7 = this.f40187b;
                if (i11 == R.id.rb_model1) {
                    ((Env) cVar7.f23491c).csDisplay = 0;
                } else if (i11 == R.id.rb_model2) {
                    ((Env) cVar7.f23491c).csDisplay = 1;
                } else if (i11 == R.id.rb_model3) {
                    ((Env) cVar7.f23491c).csDisplay = 2;
                }
                ((Env) cVar7.f23491c).updateEntry("csDisplay");
                break;
            case 7:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar8 = this.f40187b;
                if (i11 == R.id.rb_white) {
                    ((Env) cVar8.f23491c).themeStyle = 0;
                } else if (i11 == R.id.rb_yellow) {
                    ((Env) cVar8.f23491c).themeStyle = 1;
                } else if (i11 == R.id.rb_green) {
                    ((Env) cVar8.f23491c).themeStyle = 2;
                } else if (i11 == R.id.rb_night) {
                    ((Env) cVar8.f23491c).themeStyle = 3;
                }
                ((Env) cVar8.f23491c).updateEntry("themeStyle");
                break;
            default:
                kotlin.jvm.internal.m.f(radioGroup, "<unused var>");
                dm.c cVar9 = this.f40187b;
                if (i11 == R.id.rb_size_small) {
                    ((Env) cVar9.f23491c).textSizeDel = FontSizeStyleKt.legacyFontSizeStyleValueFromGroup(0);
                } else if (i11 == R.id.rb_size_middle) {
                    ((Env) cVar9.f23491c).textSizeDel = FontSizeStyleKt.legacyFontSizeStyleValueFromGroup(1);
                } else if (i11 == R.id.rb_size_large) {
                    ((Env) cVar9.f23491c).textSizeDel = FontSizeStyleKt.legacyFontSizeStyleValueFromGroup(2);
                }
                ((Env) cVar9.f23491c).updateEntry("textSizeDel");
                break;
        }
    }
}
