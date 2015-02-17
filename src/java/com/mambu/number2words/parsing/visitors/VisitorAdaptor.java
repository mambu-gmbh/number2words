package com.mambu.number2words.parsing.visitors;

import java.util.Objects;

import com.mambu.number2words.parsing.interfaces.TranscriptionContext;
import com.mambu.number2words.parsing.interfaces.ValueToken;
import com.mambu.number2words.parsing.interfaces.Visitor;
import com.mambu.number2words.parsing.tokenization.DecimalValueToken;
import com.mambu.number2words.parsing.tokenization.GroupListToken;
import com.mambu.number2words.parsing.tokenization.LiteralValueToken;
import com.mambu.number2words.parsing.tokenization.MappedValueToken;
import com.mambu.number2words.parsing.tokenization.NullValueToken;
import com.mambu.number2words.parsing.tokenization.PrefixedValueToken;
import com.mambu.number2words.parsing.tokenization.SuffixedValueToken;

/**
 * Adaptor for {@link Visitor} using {@link Void} as return type for all visits.
 * 
 * @author aatasiei
 *
 */
public abstract class VisitorAdaptor<T> implements Visitor<T> {

	/**
	 * {@link ValueToken} evaluation context for this visitor.
	 */
	protected final TranscriptionContext context;

	/**
	 * Default constructor
	 * 
	 * @param context
	 *            - context holding the necessary visiting information.
	 */
	protected VisitorAdaptor(TranscriptionContext context) {
		this.context = Objects.requireNonNull(context, "Transcription context can not be null.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitNullValue(NullValueToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitGroupList(GroupListToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitMappedValue(MappedValueToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitPrefixedValue(PrefixedValueToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitSuffixedValue(SuffixedValueToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitDecimalValue(DecimalValueToken token) {
		// default: accept all
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T visitLiteral(LiteralValueToken token) {
		// default: accept all
		return null;
	}
}