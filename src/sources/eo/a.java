package eo;

import android.widget.TextView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import mp.b;
import qp.d5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f25717p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, long j11, ArrayList arrayList, int i11) {
        super(bVar, j11, arrayList);
        this.f25717p = i11;
    }

    @Override // qp.d5
    public final ArrayList s() {
        switch (this.f25717p) {
            case 0:
                return p0.r("n.f.", "n.m.");
            case 1:
                ArrayList arrayList = new ArrayList();
                arrayList.add("die ~");
                arrayList.add("der ~");
                arrayList.add("das ~");
                return arrayList;
            default:
                return p0.r("n.f.", "n.m.");
        }
    }

    @Override // qp.d5
    public final boolean t(Word word, String str) {
        String str2;
        switch (this.f25717p) {
            case 0:
                String str3 = "n.f.";
                if (!word.getPos().equals("n.f.")) {
                    str3 = "n.m.";
                    if (!word.getPos().equals("n.m.")) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                }
                return str3.equals(str);
            case 1:
                if (word.getPos().equals("m.")) {
                    str2 = "der ~";
                } else if (word.getPos().equals("n.")) {
                    str2 = "das ~";
                } else {
                    str2 = word.getPos().equals("f.") ? "die ~" : BuildConfig.VERSION_NAME;
                }
                return str2.equals(str);
            default:
                String str4 = "n.f.";
                if (!word.getPos().equals("n.f.")) {
                    str4 = "n.m.";
                    if (!word.getPos().equals("n.m.")) {
                        str4 = BuildConfig.VERSION_NAME;
                    }
                }
                return str4.equals(str);
        }
    }

    @Override // qp.d5
    public final void v(TextView textView) {
        switch (this.f25717p) {
            case 0:
                textView.setText(R.string.choose_the_correct_grammatical_gender);
                break;
            case 1:
                textView.setText(R.string.choose_the_correct_grammatical_gender);
                break;
            default:
                textView.setText(R.string.choose_the_correct_grammatical_gender);
                break;
        }
    }
}
