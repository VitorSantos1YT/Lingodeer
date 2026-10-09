package w00;

import com.android.billingclient.api.c0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends c10.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f54410e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f54412b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00.l f54411a = new z00.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54413c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f54414d = new c0(14, (byte) 0);

    public i(Pattern pattern) {
        this.f54412b = pattern;
    }

    @Override // c10.a
    public final void a(a10.e eVar) {
        c0 c0Var = this.f54414d;
        CharSequence charSequence = eVar.f289a;
        StringBuilder sb2 = (StringBuilder) c0Var.f7471c;
        if (c0Var.f7470b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        c0Var.f7470b++;
        Pattern pattern = this.f54412b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f54413c = true;
    }

    @Override // c10.a
    public final void e() {
        this.f54411a.f58433g = ((StringBuilder) this.f54414d.f7471c).toString();
        this.f54414d = null;
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54411a;
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        if (this.f54413c) {
            return null;
        }
        if (fVar.f54391i && this.f54412b == null) {
            return null;
        }
        return l8.h.a(fVar.f54385c);
    }
}
