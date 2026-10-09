package om;

import android.widget.TextView;
import com.lingo.lingoskill.object.JPChar;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends j {
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nm.b bVar, Env mEnv, ArrayList arrayList, int i11) {
        super(bVar, mEnv, arrayList);
        this.R = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(mEnv, "mEnv");
                super(bVar, mEnv, arrayList);
                break;
            case 2:
                kotlin.jvm.internal.m.f(mEnv, "mEnv");
                super(bVar, mEnv, arrayList);
                break;
            default:
                kotlin.jvm.internal.m.f(mEnv, "mEnv");
                break;
        }
    }

    @Override // om.j
    public final void j(JPChar option, TextView textView, TextView textView2, TextView textView3) {
        switch (this.R) {
            case 0:
                kotlin.jvm.internal.m.f(option, "option");
                um.c.a(textView2);
                textView2.setText(option.getPing());
                break;
            case 1:
                kotlin.jvm.internal.m.f(option, "option");
                um.c.a(textView2);
                textView2.setText(option.getPian());
                break;
            default:
                kotlin.jvm.internal.m.f(option, "option");
                um.c.a(textView2);
                textView2.setText(option.getPian());
                break;
        }
    }

    @Override // om.j
    public final void k(JPChar option, TextView textView) {
        switch (this.R) {
            case 0:
                kotlin.jvm.internal.m.f(option, "option");
                textView.setText(option.getDisplayLuoMa());
                break;
            case 1:
                kotlin.jvm.internal.m.f(option, "option");
                textView.setText(option.getDisplayLuoMa());
                break;
            default:
                kotlin.jvm.internal.m.f(option, "option");
                um.c.a(textView);
                textView.setText(option.getPing());
                break;
        }
    }

    @Override // om.j
    public final void l(JPChar jPChar, TextView textView, TextView textView2, TextView textView3) {
        switch (this.R) {
            case 0:
                textView.setVisibility(8);
                um.c.a(textView2);
                textView2.setText(jPChar.getPing());
                textView3.setText(jPChar.getDisplayLuoMa());
                break;
            case 1:
                textView.setVisibility(8);
                um.c.a(textView2);
                textView2.setText(jPChar.getPian());
                textView3.setText(jPChar.getDisplayLuoMa());
                break;
            default:
                textView.setVisibility(8);
                um.c.a(textView2);
                um.c.a(textView3);
                textView2.setText(jPChar.getPian());
                textView3.setText(jPChar.getPing());
                break;
        }
    }
}
