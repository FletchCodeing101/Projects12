import random

def hangman():
    word_list = ['science', 'toilet', 'refridgerator', 'shoes', 'building']
    word = random.choice(word_list)
    guessed_letters = []
    attempts = 6
    
    print("Welcome to Hangman!")
    
    while attempts > 0:
        display_word = ''.join([letter if letter in guessed_letters else '_' for letter in word])
        print(f"Word: {display_word}")
        
        if '_' not in display_word:
            print("Congratulations! You guessed the word!")
            break
        
        guess = input("Guess a lowercase letter: ").lower()
        
        if guess in guessed_letters:
            print("You already guessed that letter.")
        elif guess in word:
            guessed_letters.append(guess)
            print("Good guess!")
        else:
            guessed_letters.append(guess)
            attempts -= 1
            print(f"Incorrect! You have {attempts} attempts remaining.")
        
    if attempts == 0:
        print(f"Game over! The word was '{word}'.")

hangman()
