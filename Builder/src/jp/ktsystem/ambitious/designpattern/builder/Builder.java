package jp.ktsystem.ambitious.designpattern.builder;

public class Builder {

	private boolean initialized = false;

	private String s;

	// --- constructor

	public Builder(String s) {
		this.s = s;
		this.initialized = true;
	}

	// --- public

	public Builder add(String s) {

		// 螟画峩繧貞刈縺医∪縺励◆縲�		// 2014/03/12 螟画峩
		// 繝悶Λ繝ｳ繝√ｒ蛻�▲縺ｦ螟画峩
		// 蜀榊ｺｦ螟画峩

		if (!initialized) throw new RuntimeException("Builder is not initialized.");
		this.s += s; // (Better to use StringBuilder.)
		return this;
	}

	public String build() {
		return s;
	}
}
